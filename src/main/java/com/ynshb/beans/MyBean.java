package com.ynshb.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    public MyBean() {
        System.out.println("1️⃣ Constructor: Bean instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2️⃣ BeanNameAware: Bean name is " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("3️⃣ BeanFactoryAware: BeanFactory set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println("4️⃣ ApplicationContextAware: ApplicationContext set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("6️⃣ @PostConstruct: Bean initialization (best practice)");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("7️⃣ InitializingBean: afterPropertiesSet");
    }

    public void customInit() {
        System.out.println("8️⃣ Custom init-method called");
    }

    @Override
    public void destroy() {
        System.out.println("🔟 DisposableBean: destroy()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("9️⃣ @PreDestroy called");
    }

    public void customDestroy() {
        System.out.println("🧹 Custom destroy-method called");
    }
}

