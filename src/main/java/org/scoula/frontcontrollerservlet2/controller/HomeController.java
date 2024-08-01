package org.scoula.frontcontrollerservlet2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("imgSrc", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdInSDu91rwLJ5c1KZtXEIrvb7BpHMvF4XMQ&s");
        return "index";
    }
}
