package org.james.gosl.spring.webmvc.handler.mapper.controller;

import org.james.gosl.spring.webmvc.handler.mapper.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;


/**
 * 通过函数式编程的方式来注册URL 映射
 *
 * 注册的类是由RouterFunctionMapping 检测为HandlerMapping 的，后面需要由HandlerFunctionAdapter 来决定如何执行
 *
 * @author James Gosl
 * @since 2023/08/14 15:16
 */
@RestController
public class RouterFunctionMappingController {

    @Autowired
    private HelloService helloService;

    @Bean
    public RouterFunction<ServerResponse> hello() {
        return RouterFunctions.route()
                .GET("/routerFunctionMapping", request -> ServerResponse.ok().body(helloService.hello()))
                .build();
    }
}
