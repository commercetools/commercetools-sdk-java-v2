
package io.vrap.rmf.base.client.http;

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

/**
 * Unified logger instance to perform logging only for configured logging levels.
 * Creates a hierarchy of loggers for requests and responses
 */
public class InternalLogger {
    private final Logger underlyingLogger;

    public static final String TOPIC_REQUEST = "request";
    public static final String TOPIC_RESPONSE = "response";

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

    public InternalLogger debug(final Supplier<Object> message, final Throwable throwable) {
        if (underlyingLogger.isDebugEnabled()) {
            underlyingLogger.debug(message.get().toString(), throwable);
        }
        return this;
    }

    public InternalLogger info(final Supplier<Object> message) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.info(message.get().toString());
        }
        return this;
    }

    public InternalLogger info(final Supplier<Object> message, final Throwable throwable) {
        if (underlyingLogger.isInfoEnabled()) {
            underlyingLogger.info(message.get().toString(), throwable);
        }
        return this;
    }

    public InternalLogger trace(final Supplier<Object> message) {
        if (isTraceEnabled()) {
            underlyingLogger.trace(message.get().toString());
        }
        return this;
    }

    public InternalLogger trace(final Supplier<Object> message, final Throwable throwable) {
        if (underlyingLogger.isTraceEnabled()) {
            underlyingLogger.trace(message.get().toString(), throwable);
        }
        return this;
    }

    public InternalLogger warn(final Supplier<Object> message) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.warn(message.get().toString());
        }
        return this;
    }

    public InternalLogger warn(final Supplier<Object> message, final Throwable throwable) {
        if (underlyingLogger.isWarnEnabled()) {
            underlyingLogger.warn(message.get().toString(), throwable);
        }
        return this;
    }

    public InternalLogger error(final Supplier<Object> message) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.error(message.get().toString());
        }
        return this;
    }

    public InternalLogger error(final Supplier<Object> message, final Throwable throwable) {
        if (underlyingLogger.isErrorEnabled()) {
            underlyingLogger.error(message.get().toString(), throwable);
        }
        return this;
    }

    public InternalLogger log(final Level level, final Supplier<Object> message) {
        switch (level) {
            case INFO:
                return info(message);
            case ERROR:
                return error(message);
            case WARN:
                return warn(message);
            case DEBUG:
                return debug(message);
            case TRACE:
                return trace(message);
        }
        return this;
    }

    public InternalLogger log(final Level level, final Supplier<Object> message, final Throwable throwable) {
        switch (level) {
            case INFO:
                return info(message, throwable);
            case ERROR:
                return error(message, throwable);
            case WARN:
                return warn(message, throwable);
            case DEBUG:
                return debug(message, throwable);
            case TRACE:
                return trace(message, throwable);
        }
        return this;
    }
}
