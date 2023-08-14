package org.james.gosl.spring.webmvc.handler.adapter.controller;

import org.james.gosl.spring.webmvc.handler.adapter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * 通过HandlerFunctionAdapter 适配器处理HandlerFunction 类型的Handler
 *
 * @author James Gosl
 * @since 2023/08/14 15:36
 */
@RestController
public class HandlerFunctionAdapterController {

    @Autowired
    private HelloService helloService;

    @Bean
    public RouterFunction<ServerResponse> hello() {
        return RouterFunctions.route()
                .GET("/handlerFunctionAdapter", request -> ServerResponse.ok().body(helloService.hello()))
                .build();
    }
}
