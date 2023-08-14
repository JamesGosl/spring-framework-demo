package org.james.gosl.spring.webmvc.handler.mapper.controller;

import org.james.gosl.spring.webmvc.handler.mapper.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过类名路径的方式来注册URL 映射
 *
 * 类是由BeanNameUrlHandlerMapping 检测为HandlerMapping 的，后面需要由HandlerAdapter 来决定如何执行
 *
 * @author James Gosl
 * @since 2023/08/14 14:25
 */
@RestController("/beanNameUrlHandlerMapping")
public class BeanNameUrlHandlerMappingController implements Controller {

    @Autowired
    private HelloService helloService;

    // 通过SimpleControllerHandlerAdapter 适配器来完成方法调用
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getOutputStream().println(helloService.hello());
        return null;
    }
}
