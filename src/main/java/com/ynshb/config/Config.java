package com.ynshb.config;

import com.ynshb.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public MyBean beanMyBean() {
        return new MyBean();
    }
}
