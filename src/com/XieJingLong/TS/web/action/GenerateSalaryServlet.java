package com.XieJingLong.TS.web.action;

import com.XieJingLong.TS.util.SalaryDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王启越
 * @date 2021/9/30
 */
public class GenerateSalaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SalaryDao salaryDao = new SalaryDao();
        salaryDao.generateItems();
    }
}
