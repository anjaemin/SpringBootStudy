package io.leeroy.boot.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

//@Slf4j
public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {

    private Logger logger = LoggerFactory.getLogger(ApplicationStartingListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
//        log.info("Application Start: {}", event);
        logger.info("Application Start: {}", event);
        System.out.println("Application Start!!!");
    }
}
