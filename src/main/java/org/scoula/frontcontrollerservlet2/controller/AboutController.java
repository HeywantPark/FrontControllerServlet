package org.scoula.frontcontrollerservlet2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("imgSrc", "https://cdn.sisajournal.com/news/photo/202004/198518_103753_4757.jpg");
        return "about";
    }
}
