package com.campus.filter;
import java.io.IOException;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

@WebFilter("/*")
public class LoggingFilter extends HttpFilter {
    
    @Override 
    public  void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,ServletException {
        System.out.println("Request received");
        chain.doFilter(request, response);
        System.out.println("Response sent");
    }
}