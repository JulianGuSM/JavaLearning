package com.springinaction.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * The type Spittr web app initializer.
 * AbstractAnnotationConfigDispatcherServletInitializer的任意类都会自动地配置
 * Dispatcher-servlet和Spring应用上下文，Spring的应用上下文会位于应用程序的Servlet上下文中
 *
 * Spring 3.2 引入了一个便利的WebApplicationInitializer基础实现，也就是AbstractAnnotationConfigDispatcherServletInitializer
 *
 * DispatcherServlet和个Servlet监听器（也就是ContextLoaderListener）的关系：
 * --Begin
 * 当DispatcherServlet启动的时候，它会创建Spring应用上下文，并加载配置文件或配置类中所声明的bean。
 * 在 getServletConfigClasses()方法中，我们要求DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类（使用Java配置）中的bean。
 * 但是在Spring Web应用中，通常还会有另外一个应用上下文。另外的 这个应用上下文是由ContextLoaderListener创建的。
 * 我们希望DispatcherServlet加载包含Web组件的bean，如控制器、视图解析器以及处理器映射，
 * 而ContextLoaderListener要加载应用中的其他bean。这些bean通常是驱动应用后端的中间层和数据层组件。
 * 实际上，AbstractAnnotationConfigDispatcherServletInitializer会同时创建DispatcherServlet和ContextLoaderListener。
 * getServletConfigClasses()方法返回的带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的bean。
 * getRootConfigClasses()方法返回的带有@Configuration注解的类将会用来配置ContextLoaderListener创建的应用上下文中的bean。
 *
 * 需要注意的是，通过AbstractAnnotationConfigDispatcherServletInitializer来配置DispatcherServlet是传统web.xml方式的替代方案。
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class};
    }

    /**
     * getServletConfigClasses()方法返回的带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的bean。
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class};
    }

    /**
     * getServletMappings()，它会将一个或多个路径映射到DispatcherServlet上
     * 本例中它映射的是“/”，这表示它回事应用默认的Servlet，他会处理进入系统的所有请求
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/"};
    }
}
