package com.XieJingLong.TS.util;

import com.XieJingLong.TS.entity.SalaryItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author 王启越
 * @date 2021/9/30
 */
public class SalaryDao {
    /**
     * @return 返回工资项目列表
     */
    public ArrayList<SalaryItem> generateItems() {
        // 根据每个老师的 职务、职称 计算其应发工资数
        // 根据全局变量 五险一金 参数，计算应扣工资数
        // 实发工资 = 应发工资 - 五险一金

        ArrayList<SalaryItem> salaryItems = new ArrayList<>();
        //JDBC连接数据库保存数据
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            DBUtil.beginTransaction(conn);
            String sql = "select id,realname,post_id,title_id from tea_info";
            ps = conn.prepareStatement(sql);
            ps.executeQuery(sql);
            rs = ps.getResultSet();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("realname");
                int postId = rs.getInt("post_id");
                int titleId = rs.getInt("title_id");

                double postSalary = new PostDao().getPost(postId).getSalary();
                double titleSalary = new TitleDao().getTitle(titleId).getSalary();
                double totalPayAmount = postSalary+titleSalary;
                double insurance = totalPayAmount*SalaryItem.insuranceRate;
                double publicReverseFunds = totalPayAmount*SalaryItem.publicReserveFundsRate;
                double finalPayAmount = totalPayAmount-insurance-publicReverseFunds;

                SalaryItem item = new SalaryItem(id,name,postSalary,titleSalary,totalPayAmount,insurance,publicReverseFunds,finalPayAmount);
                salaryItems.add(item);
            }
        }catch (Exception e){
            e.printStackTrace();
            DBUtil.rollbackTransaction(conn);
        }finally {
            DBUtil.close(conn, ps, null);
        }

        return salaryItems;
    }
}
