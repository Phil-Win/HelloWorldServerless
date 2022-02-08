package com.dramaticparsley.projectpollo;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloWorldHandlerTest {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldHandlerTest.class);

    @Test
    void invokeTest() {
        logger.info("Invoke TEST");
        String event = "Hello world";
        Context context = new TestContext();
        HelloWorldHandler handler = new HelloWorldHandler();
        String result = handler.handleRequest(event, context);
        assertTrue(result.contains("200 OK"));
    }
}