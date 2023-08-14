/**
 * 通过Controller 和HttpRequestHandler 实现的Handler 在注册的时候没有什么区别，都是通过BeanNameUrlHandlerMapping 来注册请求映射的。
 * 但是Controller 有返回值，SimpleControllerHandlerAdapter 适配器在执行handle 回调的方法的时候会接受返回值并响应出去。
 * HttpRequestHandler 没有返回值，HttpRequestHandlerAdapter 适配器在之心handler 回调的方法之后，会返回null 出去，这就要求在实现
 * HttpRequestHandler 的时候必须要通过HttpServletResponse 将响应值手动的写出去
 */
package org.james.gosl.spring.webmvc.handler.adapter.controller;