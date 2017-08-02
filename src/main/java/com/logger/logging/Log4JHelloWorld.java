package com.logger.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Murat on 7/31/2017.
 */

public class Log4JHelloWorld {

    private final static Logger logger = LoggerFactory.getLogger(Log4JHelloWorld.class);

    public static void main(String[] args){
        logger.debug("Hello World!");

        logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.error("Sample error message");

        logger.info("Sample with params. param1: {} param2: {}", 100, 101);
    }
}