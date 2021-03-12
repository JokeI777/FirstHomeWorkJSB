package com.example.demo;

import com.example.demo.PlugService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Simple simple(){
        return new Simple();
    }

    @Bean
    public String simpleProperty(){
        return "SimpleProperty";
    }

    static class Simple{
        public void init(){
            System.out.println("init");
        }
    }
}
