package org.james.gosl.spring.webmvc.handler.mapper.service;

import org.springframework.stereotype.Service;

/**
 * Hello Service
 *
 * @author James Gosl
 * @since 2023/08/14 12:15
 */
@Service
public class HelloService {

    public String hello() {
        return "<h1>Hello World</h1>";
    }
}
