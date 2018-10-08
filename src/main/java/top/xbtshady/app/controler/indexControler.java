package top.xbtshady.app.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexControler {

    public String index(){
        return "index";
    }
}
