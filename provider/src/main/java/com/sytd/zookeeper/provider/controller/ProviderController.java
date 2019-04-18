package com.sytd.zookeeper.provider.controller;

import com.sytd.zookeeper.provider.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 类功能描述
 *
 * @author 朱宗刚
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController
public class ProviderController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Mono<String> helloWorld() {
        logger.info("Hello World! ");
        return service.helloWorld();
    }

    public ProviderController(ProviderService service) {
        this.service = service;
    }

    private ProviderService service;

    private static final Logger logger = LoggerFactory.getLogger(ProviderController.class);
}
