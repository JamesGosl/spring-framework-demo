package org.james.gosl.spring.webmvc.handler.adapter.controller;

import org.james.gosl.spring.webmvc.handler.adapter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过RequestMappingHandlerAdapter 适配器处理RequestMapping 注解类型的Handler
 *
 * @author James Gosl
 * @since 2023/08/14 15:35
 */
@RestController
@RequestMapping("/requestMappingHandlerAdapter")
public class RequestMappingHandlerAdapterController {

    @Autowired
    private HelloService helloService;

    @RequestMapping({"", "/"})
    public String hello() {
        return helloService.hello();
    }
}
