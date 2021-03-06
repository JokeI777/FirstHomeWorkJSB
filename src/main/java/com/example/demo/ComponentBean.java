package com.example.demo;

import java.lang.String;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ComponentBean implements PlugInterface, InitializingBean, DisposableBean {

    private String simpleProperty;

    public ComponentBean(String simpleProperty){
        this.simpleProperty = simpleProperty;
    }
    @PostConstruct
    public void created(){
        System.out.println("Created");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy f" + simpleProperty);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("f !" + simpleProperty);
    }

    @Override
    public String getPlug() {
        return "  !";
    }
}
