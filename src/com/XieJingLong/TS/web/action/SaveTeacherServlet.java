package com.XieJingLong.TS.web.action;

import com.XieJingLong.TS.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SaveTeacherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取教师信息
        request.setCharacterEncoding("UTF-8");
        String realname = request.getParameter("realname");
        String sex = request.getParameter("sex");
        String post = request.getParameter("post");
        String title = request.getParameter("title");

        //JDBC连接数据库保存数据
        Connection conn = null;
        PreparedStatement ps = null;
        int ResultCount = 0;
        try {
            conn = DBUtil.getConnection();
            DBUtil.beginTransaction(conn);
            String sql = "insert into tea_info(realname,sex,post,title) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, realname);
            ps.setString(2, sex);
            ps.setString(3, post);
            ps.setString(4,title);
            ResultCount = ps.executeUpdate();
            DBUtil.commitTransaction(conn);
        } catch (Exception e) {
            DBUtil.rollbackTransaction(conn);
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, null);
        }

        //保存成跳转成功页面

        response.sendRedirect(request.getContextPath() + "/list");


    }
}
