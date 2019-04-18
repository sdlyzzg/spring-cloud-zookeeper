package com.sytd.zookeeper.provider.service.impl;

import com.sytd.zookeeper.provider.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * 类功能描述
 *
 * @author 朱宗刚
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    private static final Logger logger = LoggerFactory.getLogger(ProviderServiceImpl.class);

    @Override
    public Mono<String> helloWorld() {
        logger.debug("begin function helloWorld");
        String rst = UUID.randomUUID().toString();
        return Mono.just(rst);
    }
}
