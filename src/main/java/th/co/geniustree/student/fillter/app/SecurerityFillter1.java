/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.student.fillter.app;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author best
 */
public class SecurerityFillter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Before chain...1");
        Object user = ((HttpServletRequest) request).getSession().getAttribute("user");
//        if (user == null) {
//            ((HttpServletResponse)response).sendRedirect("/fillter-app/login.html");
//        } else {
//            chain.doFilter(request, response);
//        }
        chain.doFilter(request, response);
        System.out.println("After chain...1");

    }

    @Override
    public void destroy() {

    }

}
