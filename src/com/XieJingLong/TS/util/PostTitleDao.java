package com.XieJingLong.TS.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 王启越
 * @date 2021/10/10
 */
public class PostTitleDao extends DBUtil {
    String table;
    PostTitleDao(String table){
        this.table = table;
    }
    /**
     *
     * @return 返回职务or职称名称的列表
     */
    public List<String> getNames() {
        List<String> names = null;

        //JDBC连接数据库保存数据
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            names = new ArrayList<>();
            conn = DBUtil.getConnection();
            DBUtil.beginTransaction(conn);
            String sql = "select name from "+ table;
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while (rs.next()) {

                String name = rs.getString("name");
                names.add(name);
            }
        } catch (Exception e) {
            DBUtil.rollbackTransaction(conn);
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, null);
        }

        return names;

    }

    /**
     * 根据项目名获取对应薪资
     * @param name 项目名
     * @return 薪资
     */
    public double getSalary(String name){
        double salary=0;
        //JDBC连接数据库保存数据
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            conn = DBUtil.getConnection();
            DBUtil.beginTransaction(conn);
            String sql = "select salary from "+ table + " where name='" + name +"'";
            System.out.println(sql);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                salary = rs.getDouble("salary");
            }
        } catch (Exception e) {
            DBUtil.rollbackTransaction(conn);
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, null);
        }
        return salary;
    }

}
