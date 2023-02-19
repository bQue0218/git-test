package com.bque.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * comment,,,
 *
 * @author bQue
 * @version 1.0
 * @since 2023.02.19.(일)
 */

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String printHello() {
        return "Hello Git";
    }
}
