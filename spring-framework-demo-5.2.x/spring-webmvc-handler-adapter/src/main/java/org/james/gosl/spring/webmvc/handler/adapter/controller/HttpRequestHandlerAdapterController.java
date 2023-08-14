package org.james.gosl.spring.webmvc.handler.adapter.controller;

import org.james.gosl.spring.webmvc.handler.adapter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 通过HttpRequestHandlerAdapter 适配器处理HttpRequestHandler 类型的Handler
 *
 * @author James Gosl
 * @since 2023/08/14 15:32
 */
@RestController("/httpRequestHandlerAdapter")
//@RequestMapping() //不能使用RequestMapping 来设置请求映射地址，否则会由RequestMappingHandlerMapping 检查是否加载
public class HttpRequestHandlerAdapterController implements HttpRequestHandler {

    @Autowired
    private HelloService helloService;

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getOutputStream().println(helloService.hello());
    }
}
