
package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;

@FunctionalInterface
public interface ErrorLogFormatter {
    public String format(ApiHttpRequest request, Throwable throwable, long executionTime);
}
