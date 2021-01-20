
package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class AuthException extends ApiHttpException {
    public AuthException(final int statusCode, final String body, final ApiHttpHeaders headers) {
        this(statusCode, body, headers, null, null);
    }

    public AuthException(final int statusCode, final String body, final ApiHttpHeaders headers, final String message) {
        super(statusCode, body, headers, message, null);
    }

    public AuthException(final int statusCode, final String body, final ApiHttpHeaders headers, final String message,
            final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
    }
}
