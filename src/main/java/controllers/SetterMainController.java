package controllers;

import com.example.demo.PlugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterMainController {
    private PlugService plugService;

    public PlugService Start(){
        return plugService;
    }

    @Autowired
    public void setPlugService(PlugService plugService){
        this.plugService = plugService;
    }
}
