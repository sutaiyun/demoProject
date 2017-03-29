package com.example.controller;

import com.example.domain.BaseResponse;
import com.example.service.SessionService;
import com.example.util.ErrorEnum;
import net.minidev.json.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by sutaiyun on 2017/3/28.
 */
public class SessionHandlerInterceptor implements HandlerInterceptor {
    @Autowired
    private SessionService sessionService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader("DEMO-TOKEN");
        System.out.println("Url: " + httpServletRequest.getRequestURI() + " DEMO-TOKEN: " + token);

        if (null == token || !sessionService.tokenIsExist(token)) {
            return errResponse(ErrorEnum.ERROR_TOKEN_NOT_EXIST.getCode(),
                                ErrorEnum.ERROR_TOKEN_NOT_EXIST.getMsg(),
                                httpServletResponse);
        }
        System.out.println("preHandle complete!!!!");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }

    private boolean errResponse(int code, String msg, HttpServletResponse httpServletResponse) throws IOException {
        BaseResponse<Object> response = new BaseResponse<>();
        response.setCode(code);
        response.setRetMsg(msg);
        httpServletResponse.setHeader("Content-Type", "application/json;charset=UTF-8");
        Writer writer = httpServletResponse.getWriter();
        writer.write(JSONValue.toJSONString(response));
        return false;
    }
}
