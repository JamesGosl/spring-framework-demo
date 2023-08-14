package org.james.gosl.spring.webmvc.handler.mapper.controller;

import org.james.gosl.spring.webmvc.handler.mapper.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过RequestMapping 注解方式来注册URL 映射
 *
 * 类是由RequestMappingHandlerMapping 检测为HandlerMapping 的，后面需要由RequestMappingHandlerAdapter 来决定如何执行
 *
 * @author James Gosl
 * @since 2023/08/14 15:12
 */
@RestController
@RequestMapping("/requestMappingHandlerMapping")
public class RequestMappingHandlerMappingController {

    @Autowired
    private HelloService helloService;

    @RequestMapping({"", "/"})
    public String hello() {
        return helloService.hello();
    }
}
