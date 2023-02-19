package com.bque.demo.web;

import com.bque.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * comment,,,
 *
 * @author bQue
 * @version 1.0
 * @since 2023.02.19.(일)
 */

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;

    @GetMapping("/hello")
    public String printHello() {
        return helloService.sayHello() + "Git Sample Test.";
    }
}
