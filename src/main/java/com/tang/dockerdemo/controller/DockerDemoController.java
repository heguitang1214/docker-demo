package com.tang.dockerdemo.controller;

import com.tang.dockerdemo.service.DockerDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * docker Demo
 *
 * @author Tang
 */
@RestController
@RequestMapping("/docker")
public class DockerDemoController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DockerDemoService dockerDemoService;

    @RequestMapping("/demo")
    @ResponseBody
    public String dockerTest() {
        logger.info("进入方法：dockerTest()");
        int i = 10;
        int j = 20;
        logger.info("{} + {} = {}", i, j, i + j);
        return "hello Docker!";
    }

}
