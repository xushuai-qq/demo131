package com.example.demo.resources;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourcesXml implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有D:springboot\\pic访问都映射到、mypic下面
        registry.addResourceHandler("/myPic/**").addResourceLocations("file:C:\\Users\\xushuai\\Desktop\\pic\\");
    }

}
