package org.james.gosl.spring.webmvc.handler.adapter;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * Spring 官方建议的写法，这样更加偏向编程化 更容易理解
 *
 * Servlet SPI 会调用SpringServletContainerInitializer 初始化操作，同时会携带一个WebApplicationInitializer 的集合来作为参数
 * SpringServletContainerInitializer 执行对WebApplicationInitializer 的回调操作
 */
public class HandlerAdapterApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) {
		// Load Spring web application configuration
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(HandlerAdapterApplication.class);

		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/*");
	}
}