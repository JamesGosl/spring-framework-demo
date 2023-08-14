package org.james.gosl.spring.webmvc.handler.adapter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * StartupCustom Application
 *
 * @author James Gosl
 * @since 2023/08/14 13:38
 */
@ComponentScans({
        @ComponentScan(
                basePackages = "org.james.gosl.spring.webmvc.handler.adapter.controller",
                includeFilters = @ComponentScan.Filter(Controller.class)
        ),
        @ComponentScan(
                basePackages = "org.james.gosl.spring.webmvc.handler.adapter.service",
                includeFilters = @ComponentScan.Filter(Service.class)
        ),
})
@Configuration
public class HandlerAdapterApplication {
}
