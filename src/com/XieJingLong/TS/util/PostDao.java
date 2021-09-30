package com.XieJingLong.TS.util;

import com.XieJingLong.TS.entity.Post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author 王启越
 * @date 2021/9/30
 */
public class PostDao extends DBUtil {
    /**
     * @param postId 根据一个postId查找数据库中的post对象
     * @return 返回一个post对象
     */
    public Post getPost(int postId) {
        Post post = null;

        //JDBC连接数据库保存数据
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            post = new Post();
            conn = DBUtil.getConnection();
            DBUtil.beginTransaction(conn);
            String sql = "select id,name,salary from post_salary_relation where id=" + postId;
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while (rs.next()) {

                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                post.setPost(name);
                post.setPost_id(postId);
                post.setSalary(salary);
            }
        } catch (Exception e) {
            DBUtil.rollbackTransaction(conn);
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, null);
        }

        return post;

    }
}
