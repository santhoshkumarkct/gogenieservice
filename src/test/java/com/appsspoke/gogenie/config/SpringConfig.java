package com.appsspoke.gogenie.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("com.appsoke.gogenie")
public class SpringConfig extends WebMvcConfigurerAdapter {

}
