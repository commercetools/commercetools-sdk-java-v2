
package io.vrap.rmf.base.client.http;

import java.util.Optional;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class LogFormatter {
    public static String formatResponse(ApiHttpRequest request, ApiHttpResponse<byte[]> response, long executionTime) {
        return String
                .format("%s %s %s %s %s %s", request.getMethod().name(), request.getUrl(), response.getStatusCode(),
                    executionTime,
                    Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.SERVER_TIMING)).orElse("-"),
                    Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.X_CORRELATION_ID)).orElse("-"))
                .trim();
    }

    public static String formatError(ApiHttpRequest request, Throwable throwable, long executionTime) {
        return throwable.toString();
    }
}
