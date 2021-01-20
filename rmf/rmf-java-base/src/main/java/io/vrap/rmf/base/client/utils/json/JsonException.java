
package io.vrap.rmf.base.client.utils.json;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.error.BaseException;

public class JsonException extends BaseException {
    private static final long serialVersionUID = 0L;

    public JsonException(final Throwable cause) {
        super(cause);
    }

    public JsonException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public <T> JsonException(final ApiHttpResponse<T> httpResponse) {
        super(httpResponse.toString());
    }
}
