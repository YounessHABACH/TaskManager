package com.ynshb.config;

import com.ynshb.beans.MyBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class Config {

    @Bean(name = "myBean", initMethod = "customInit", destroyMethod = "customDestroy")
    public MyBean beanMyBean() {
        log.info("beanMyBean bean called");
        return new MyBean();
    }

    @ConditionalOnMissingBean(MyBean.class)
    @Bean
    public String setBeanString() {
        log.info("setBeanString bean called");
        return new String("Hello");
    }

    @ConditionalOnClass(MyBean.class)
    @Bean
    public String setBeanString2() {
        log.info("setBeanString2 bean called");
        return new String("Hello");
    }
}
