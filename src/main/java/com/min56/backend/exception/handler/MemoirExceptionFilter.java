package com.min56.backend.exception.handler;

import com.min56.backend.exception.response.ErrorResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemoirExceptionFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response); // 여러 필터 사용 시 다음 필터를 호출하기 위해 사용힌다.  만약 마지막 필터라면 필터 실행 후 리소스를 리턴한다.
        } catch (MemoirException e) {
            response.setStatus(e.getStatus());
            response.setContentType("application/json");
            response.getWriter().println(new ErrorResponse(e.getStatus(), e.getMessage())); // Response  Body 값에 넣어줄 Exception정보를 담는다.
        }
    }
}
