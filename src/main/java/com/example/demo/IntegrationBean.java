package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class IntegrationBean {
    public PlugInterface plug;

    public IntegrationBean(PlugInterface plug){
        this.plug = plug;
    }

}
