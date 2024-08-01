package org.scoula.frontcontrollerservlet2;


import org.scoula.frontcontrollerservlet2.controller.Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="FrontControllerServlet",value="/")
public class FrontControllerServlet extends HttpServlet {
    private Map<String, Controller> controllers = new HashMap<>();

    @Override
    public void init() throws ServletException {
        //주소값과 컨트롤러 맵핑

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}