
package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

@FunctionalInterface
public interface ResponseLogFormatter {
    public String format(ApiHttpRequest request, ApiHttpResponse<byte[]> response, long executionTime);
}
