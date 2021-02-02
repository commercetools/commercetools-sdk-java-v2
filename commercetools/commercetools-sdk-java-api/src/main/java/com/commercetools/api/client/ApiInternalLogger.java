
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.http.InternalLogger;

import org.slf4j.Logger;

public class ApiInternalLogger extends InternalLogger {
    public ApiInternalLogger(Logger underlyingLogger) {
        super(underlyingLogger);
    }

    public static InternalLogger getLogger(final ApiHttpRequest httpRequest) {
        return getLogger(httpRequest, InternalLogger.TOPIC_REQUEST);
    }

    public static InternalLogger getLogger(final ApiHttpRequest httpRequest, final String topic) {
        return ApiInternalLoggerFactory.get(httpRequest, topic);
    }
}
