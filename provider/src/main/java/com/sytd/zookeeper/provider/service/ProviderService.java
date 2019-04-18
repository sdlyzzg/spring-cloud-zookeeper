package com.sytd.zookeeper.provider.service;

import reactor.core.publisher.Mono;

/**
 * 接口功能描述
 *
 * @author 朱宗刚
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ProviderService {
    Mono<String> helloWorld();
}
