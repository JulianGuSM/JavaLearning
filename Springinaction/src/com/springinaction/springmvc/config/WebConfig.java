package com.springinaction.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author : Julian
 * @date : 2019/3/4 14:25
 */

@Configuration
@EnableWebMvc //启用Spring MVC
@ComponentScan(basePackages = "com.springinaction.springmvc")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * View resolver view resolver.
     * 配置JSP视图解析器
     * @return the view resolver
     */
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/views");
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setExposeContextBeansAsAttributes(true);
        return resourceViewResolver;
    }

    /**
     * 配置静态资源的处理
     * 通过调用DefaultServlet-HandlerConfigurer的enable()方法，
     * 我们要求DispatcherServlet将对静态资源的请求转发到Servlet容器中默认的Servlet上，
     * 而不是使用DispatcherServlet本身来处理此类请求。
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }
}
