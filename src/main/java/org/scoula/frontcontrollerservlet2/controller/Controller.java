package org.scoula.frontcontrollerservlet2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
    String getView(HttpServletRequest request, HttpServletResponse response);
}
