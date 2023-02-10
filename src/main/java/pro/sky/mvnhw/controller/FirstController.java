package pro.sky.mvnhw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping
    public String helloWorld(){
        return "приложение запущено";
    }

    @GetMapping("/info")
    public String Info(@RequestParam String name, String prName, Integer data, String desc){
        return "имя: " + name +
                "название проекта: " + prName  +
                "дата создания: " + data +
                "описание: " + desc;
    }
}
