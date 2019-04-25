package com.qf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
//        页面拦截
        String uri = request.getRequestURI();
        System.out.println("拦截器"+uri);
        Object attribute = request.getSession().getAttribute("loginInfo");
        System.out.println(attribute+"============================================");
        if(attribute!=null||uri.contains("userlogin.html")||uri.contains("LoginCheck")){
         return true;
        }else if(uri.contains("messages.html")||uri.contains("messages-2.html")||uri.contains("header2.html")||uri.contains("author-login.html")||
           uri.contains("pageload.html")||uri.contains("statictics.html")){
              request.getRequestDispatcher("/userlogin.html").forward(request,response);
            return false;
        }else {
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
