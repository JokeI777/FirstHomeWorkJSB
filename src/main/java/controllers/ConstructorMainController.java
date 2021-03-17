package controllers;

import com.example.demo.PlugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorMainController {

    private PlugService plugService;

    public PlugService Start(){
        return plugService;
    }

    public ConstructorMainController(PlugService plugService){
        this.plugService = plugService;
    }
}
