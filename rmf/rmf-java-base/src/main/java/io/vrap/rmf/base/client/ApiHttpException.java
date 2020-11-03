package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.error.BaseException;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

public class ApiHttpException extends BaseException {

    private final int statusCode;
    private final String body;
    private final ApiHttpHeaders headers;
    private final String message;
    private final ApiHttpResponse<byte[]> response;

    public ApiHttpException(final int statusCode, final String body, final ApiHttpHeaders headers) {
        this(statusCode, body, headers, null);
    }

    public ApiHttpException(final int statusCode, final String body, final ApiHttpHeaders headers, final ApiHttpResponse<byte[]> response) {
        this(statusCode, body, headers, null, response);
    }

    public ApiHttpException(final int statusCode, final String body, final ApiHttpHeaders headers, final String message, final ApiHttpResponse<byte[]> response) {
        super(message);
        this.statusCode = statusCode;
        this.body = body;
        this.message = message;
        this.headers = headers;
        this.response = response;
    }

    public <T> T getBodyAs(Class<T> clazz) throws SerializationException {
        try{
            return VrapJsonUtils.getConfiguredObjectMapper().readValue(body, clazz);
        }catch (Exception e){
            throw new SerializationException(e.getMessage());
        }
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }

    public ApiHttpHeaders getHeaders() {
        return headers;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public ApiHttpResponse<byte[]> getResponse() { return response; }
}
