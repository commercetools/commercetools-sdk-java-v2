package io.vrap.rmf.base.client.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

public class InternalLogger {
    private final Logger underlyingLogger;

    protected InternalLogger(final Logger underlyingLogger) {
        this.underlyingLogger = underlyingLogger;
    }

    public static InternalLogger getLogger(final Class<?> clazz) {
        return new InternalLogger(LoggerFactory.getLogger(clazz));
    }

    public static InternalLogger getLogger(final String loggerName) {
        return new InternalLogger(LoggerFactory.getLogger(loggerName));
    }

    public boolean isTraceEnabled() {
        return underlyingLogger.isTraceEnabled();
    }

    public InternalLogger debug(final Supplier<Object> message) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.debug(message.get().toString());
        }
        return this;
    }

    public InternalLogger trace(final Supplier<Object> message) {
        if (isTraceEnabled()) {
            underlyingLogger.trace(message.get().toString());
        }
        return this;
    }

    public InternalLogger warn(final Supplier<Object> message) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.warn(message.get().toString());
        }
        return this;
    }

    public InternalLogger error(final Supplier<Object> message, final Throwable throwable) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.error(message.get().toString(), throwable);
        }
        return this;
    }
}
