package org.james.gosl.spring.webmvc.startup.custom.controller;

import org.james.gosl.spring.webmvc.startup.custom.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Controller
 *
 * @author James Gosl
 * @since 2023/08/14 12:14
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private HelloService helloServcie;

    @RequestMapping({"/", "/index"})
    public String hello() {
        return helloServcie.hello();
    }
}
