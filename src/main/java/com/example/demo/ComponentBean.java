package com.example.demo;

import java.lang.String;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ComponentBean implements InitializingBean, DisposableBean {

    private String simpleProperty;

    @Autowired
    public ComponentBean(String simpleProperty){
        this.simpleProperty = simpleProperty;
    }
    @PostConstruct
    public void created(){
        System.out.println("Created");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy " + simpleProperty);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" !" + simpleProperty);
    }
}
