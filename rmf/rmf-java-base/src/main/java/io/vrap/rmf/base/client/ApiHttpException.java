package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

public class ApiHttpException extends RuntimeException {
    
    private int statusCode;
    private String body;
    private ApiHttpHeaders headers;
    
    public ApiHttpException(int statusCode, String body, ApiHttpHeaders headers) {
        super(body);
        this.statusCode = statusCode;
        this.body = body;
        this.headers = headers;
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

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ApiHttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(ApiHttpHeaders headers) {
        this.headers = headers;
    }
}
