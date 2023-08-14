package org.james.gosl.spring.webmvc.startup.custom;

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
                basePackages = "org.james.gosl.spring.webmvc.startup.custom.controller",
                includeFilters = @ComponentScan.Filter(Controller.class)
        ),
        @ComponentScan(
                basePackages = "org.james.gosl.spring.webmvc.startup.custom.service",
                includeFilters = @ComponentScan.Filter(Service.class)
        ),
})
@Configuration
public class StartupCustomApplication {
}
