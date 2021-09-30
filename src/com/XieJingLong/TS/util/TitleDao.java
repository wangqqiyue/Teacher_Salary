package com.XieJingLong.TS.util;

import com.XieJingLong.TS.entity.Title;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * @author 王启越
 * @date 2021/9/30
 */
public class TitleDao extends DBUtil {
    /**
     * @param titleId 根据一个postId查找数据库中的post对象
     * @return 返回一个post对象
     */
    public Title getTitle(int titleId) {
        Title title = null;

        //JDBC连接数据库保存数据
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            title = new Title();
            conn = DBUtil.getConnection();
            DBUtil.beginTransaction(conn);
            String sql = "select id,name,salary from title_salary_relation where id=" + titleId;
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while (rs.next()) {

                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                title.setTitle(name);
                title.setTitle_id(titleId);
                title.setSalary(salary);
            }
        } catch (Exception e) {
            DBUtil.rollbackTransaction(conn);
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, null);
        }

        return title;

    }
}
