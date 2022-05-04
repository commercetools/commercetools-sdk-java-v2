
package io.vrap.rmf.base.client.http;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

import io.vrap.rmf.base.client.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InternalLoggerMiddlewareTest {

    @Test
    public void testLogger() {

        TestLogAppender testLogAppender = new TestLogAppender();
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
                .getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(testLogAppender);
        testLogAppender.start();

        final InternalLoggerMiddleware loggerMiddleware = InternalLoggerMiddleware
                .of((request, topic) -> new TestLogger(logger));

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("https://api.commercetools.com/"),
            new ApiHttpHeaders(), null);
        loggerMiddleware.invoke(request, apiHttpRequest -> CompletableFuture.completedFuture(
            new ApiHttpResponse<>(200, new ApiHttpHeaders(), "".getBytes(StandardCharsets.UTF_8))));

        Assertions.assertThat(testLogAppender.loggingEvents).hasSize(3);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getLevel()).isEqualTo(Level.INFO);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getFormattedMessage())
                .matches("GET https://api.commercetools.com/ 200 [0-9]+ - -");

        testLogAppender.stop();
    }

    @Test
    public void testLoggerWithServerTiming() {

        TestLogAppender testLogAppender = new TestLogAppender();
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
                .getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(testLogAppender);
        testLogAppender.start();

        final InternalLoggerMiddleware loggerMiddleware = InternalLoggerMiddleware
                .of((request, topic) -> new TestLogger(logger));

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("https://api.commercetools.com/"),
            new ApiHttpHeaders(), null);
        loggerMiddleware.invoke(request, apiHttpRequest -> CompletableFuture.completedFuture(new ApiHttpResponse<>(200,
            new ApiHttpHeaders().withHeader("Server-timing", "projects;dur=10"), "".getBytes(StandardCharsets.UTF_8))));

        Assertions.assertThat(testLogAppender.loggingEvents).hasSize(3);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getLevel()).isEqualTo(Level.INFO);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getFormattedMessage())
                .matches("GET https://api.commercetools.com/ 200 [0-9]+ projects;dur=10 -");

        testLogAppender.stop();
    }

    @Test
    public void testLoggerWithCorrelationId() {

        TestLogAppender testLogAppender = new TestLogAppender();
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
                .getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(testLogAppender);
        testLogAppender.start();

        final InternalLoggerMiddleware loggerMiddleware = InternalLoggerMiddleware
                .of((request, topic) -> new TestLogger(logger));

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("https://api.commercetools.com/"),
            new ApiHttpHeaders(), null);
        loggerMiddleware.invoke(request,
            apiHttpRequest -> CompletableFuture.completedFuture(
                new ApiHttpResponse<>(200, new ApiHttpHeaders().withHeader("X-correlation-id", "test-id/12345"),
                    "".getBytes(StandardCharsets.UTF_8))));

        Assertions.assertThat(testLogAppender.loggingEvents).hasSize(3);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getLevel()).isEqualTo(Level.INFO);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getFormattedMessage())
                .matches("GET https://api.commercetools.com/ 200 [0-9]+ - test-id/12345");

        testLogAppender.stop();
    }

    @Test
    public void testLoggerExceptionWithCorrelationId() {

        TestLogAppender testLogAppender = new TestLogAppender();
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
                .getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(testLogAppender);
        testLogAppender.start();

        final InternalLoggerMiddleware loggerMiddleware = InternalLoggerMiddleware
                .of((request, topic) -> new TestLogger(logger));

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("https://api.commercetools.com/"),
            new ApiHttpHeaders(), null);
        CompletableFuture<ApiHttpResponse<byte[]>> f = new CompletableFuture<>();
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(400,
            new ApiHttpHeaders().withHeader("X-correlation-id", "test-id/12345"), "".getBytes(StandardCharsets.UTF_8));
        f.completeExceptionally(new CompletionException(new ApiHttpException(response.getStatusCode(),
            response.getBodyAsString().orElse(""), response.getHeaders(), response)));
        loggerMiddleware.invoke(request, apiHttpRequest -> f);

        Assertions.assertThat(testLogAppender.loggingEvents).hasSize(3);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getLevel()).isEqualTo(Level.ERROR);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getFormattedMessage())
                .matches("GET https://api.commercetools.com/ 400 [0-9]+ - test-id/12345");

        testLogAppender.stop();
    }

    @Test
    public void testLoggerExceptionWithServerTiming() {

        TestLogAppender testLogAppender = new TestLogAppender();
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
                .getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(testLogAppender);
        testLogAppender.start();

        final InternalLoggerMiddleware loggerMiddleware = InternalLoggerMiddleware
                .of((request, topic) -> new TestLogger(logger));

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("https://api.commercetools.com/"),
            new ApiHttpHeaders(), null);
        CompletableFuture<ApiHttpResponse<byte[]>> f = new CompletableFuture<>();
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(400,
            new ApiHttpHeaders().withHeader("server-timing", "projects;dur=7"), "".getBytes(StandardCharsets.UTF_8));
        f.completeExceptionally(new CompletionException(new ApiHttpException(response.getStatusCode(),
            response.getBodyAsString().orElse(""), response.getHeaders(), response)));
        loggerMiddleware.invoke(request, apiHttpRequest -> f);

        Assertions.assertThat(testLogAppender.loggingEvents).hasSize(3);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getLevel()).isEqualTo(Level.ERROR);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getFormattedMessage())
                .matches("GET https://api.commercetools.com/ 400 [0-9]+ projects;dur=7 -");

        testLogAppender.stop();
    }

    @Test
    public void testLoggerException() {

        TestLogAppender testLogAppender = new TestLogAppender();
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
                .getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(testLogAppender);
        testLogAppender.start();

        final InternalLoggerMiddleware loggerMiddleware = InternalLoggerMiddleware
                .of((request, topic) -> new TestLogger(logger));

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("https://api.commercetools.com/"),
            new ApiHttpHeaders(), null);
        CompletableFuture<ApiHttpResponse<byte[]>> f = new CompletableFuture<>();
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(400, new ApiHttpHeaders(),
            "".getBytes(StandardCharsets.UTF_8));
        f.completeExceptionally(new CompletionException(new ApiHttpException(response.getStatusCode(),
            response.getBodyAsString().orElse(""), response.getHeaders(), response)));
        loggerMiddleware.invoke(request, apiHttpRequest -> f);

        Assertions.assertThat(testLogAppender.loggingEvents).hasSize(3);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getLevel()).isEqualTo(Level.ERROR);
        Assertions.assertThat(testLogAppender.loggingEvents.get(1).getFormattedMessage())
                .matches("GET https://api.commercetools.com/ 400 [0-9]+ - -");

        testLogAppender.stop();
    }

    static class TestLogAppender extends AppenderBase<ILoggingEvent> {
        ArrayList<ILoggingEvent> loggingEvents = new ArrayList<>();

        @Override
        protected void append(ILoggingEvent eventObject) {
            loggingEvents.add(eventObject);
        }

        ILoggingEvent getLastLoggedEvent() {
            if (loggingEvents.isEmpty())
                return null;

            return loggingEvents.get(loggingEvents.size() - 1);

        }
    }

    static class TestLogger extends InternalLogger {
        public TestLogger(Logger underlyingLogger) {
            super(underlyingLogger);
        }
    }
}
