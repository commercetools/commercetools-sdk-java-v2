
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ResponseSerializer;

public class DefaultHttpExceptionFactory implements HttpExceptionFactory {
    private final ResponseSerializer responseSerializer;

    public DefaultHttpExceptionFactory(ResponseSerializer serializer) {
        this.responseSerializer = serializer;
    }

    public ResponseSerializer getResponseSerializer() {
        return responseSerializer;
    }
}
