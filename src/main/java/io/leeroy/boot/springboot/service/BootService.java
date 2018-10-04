package io.leeroy.boot.springboot.service;

import io.leeroy.boot.springboot.config.ExampleProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class BootService {

    private ExampleProperties exampleProperties;

    @Autowired
    public BootService(ExampleProperties exampleProperties) {
        this.exampleProperties = exampleProperties;
    }

    @PostConstruct
    public void init() {
        log.debug("Injected properties: {}", this.exampleProperties);
    }
}
