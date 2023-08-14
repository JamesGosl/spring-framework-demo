package org.james.gosl.spring.webmvc.handler.adapter.controller;

import org.james.gosl.spring.webmvc.handler.adapter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过SimpleControllerHandlerAdapter 适配器处理Controller 类型的Handler
 *
 * @author James Gosl
 * @since 2023/08/14 15:34
 */
@RestController("/simpleControllerHandlerAdapter")
//@RequestMapping() //不能使用RequestMapping 来设置请求映射地址，否则会由RequestMappingHandlerMapping 检查是否加载
public class SimpleControllerHandlerAdapterController implements Controller {

    @Autowired
    private HelloService helloService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getOutputStream().println(helloService.hello());
        return null;
    }
}
