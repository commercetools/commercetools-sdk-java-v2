package client;

public class ApiHttpResponse {
    
    private int statusCode;
    private ApiHttpHeaders headers;
    private String body;

    public ApiHttpResponse() {
        
    }
    
    public ApiHttpResponse(int statusCode, ApiHttpHeaders headers, String body) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public ApiHttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(ApiHttpHeaders headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
