package academy.softserve.eschool.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationTest {

    @RequestMapping("/")
    public String initialize(){
        return "Hello World!";
    }

}
