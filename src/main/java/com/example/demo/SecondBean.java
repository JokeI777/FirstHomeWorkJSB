package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Primary
public class SecondBean implements PlugInterface, InitializingBean, DisposableBean {
    private String simpleProperty;

    public SecondBean(String simpleProperty){
        this.simpleProperty = simpleProperty;
    }
    @PostConstruct
    public void created(){
        System.out.println("Created");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy s" + simpleProperty);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("s !" + simpleProperty);
    }

    @Override
    public String getPlug() {
        return "  ?";
    }
}
