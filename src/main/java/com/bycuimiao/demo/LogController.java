package com.bycuimiao.demo;

import com.bycuimiao.demo.log.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/testLog")
    public void testLog() {
        logger.info("66");
    }

}
