package io.kamlesh.springbootdocker.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "<h1>Welcome to SpringBoot+Docker</h1>";
    }
}
