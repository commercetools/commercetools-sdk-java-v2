package client;

import java.util.HashMap;
import java.util.Map;

public class ApiHttpHeaders {

    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String AUTHORIZATION = "Authorization";
    public static final String USER_AGENT = "User-Agent";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String X_CORRELATION_ID = "X-Correlation-ID";
    
    private Map<String, String> headers;

    public ApiHttpHeaders() {
        this.headers = new HashMap<>();
    }

    public ApiHttpHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
    
    public void addHeader(String key, String value){
        this.headers.put(key, value);
    }
    
    public String getHeaderValue(String key){
        return this.headers.get(key);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}