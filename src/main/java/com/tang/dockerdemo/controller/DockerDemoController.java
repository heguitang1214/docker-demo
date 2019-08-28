package com.tang.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * docker Demo
 *
 * @author Tang
 */
@RestController
public class DockerDemoController {

    @RequestMapping("/docker")
    @ResponseBody
    public String dockerTest(){
        return "hello Docker!";
    }

}
