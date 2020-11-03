package io.vrap.rmf.base.client;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class ApiHttpResponse<U> extends Base {

    private int statusCode;
    private ApiHttpHeaders headers;
    private U body;
    private String message;

    public ApiHttpResponse(int statusCode, ApiHttpHeaders headers, U body) {
        this(statusCode, headers, body, null);
    }

    public ApiHttpResponse(int statusCode, ApiHttpHeaders headers, U body, String message) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
        this.message = message;
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

    public U getBody() {
        return body;
    }

    public void setBody(U body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("statusCode", statusCode)
                .append("headers", headers)
                .append("textInterpretedBody", getSecuredBody())
                .toString();
    }

    static String tryToFilter(final String input) {
        return input.replaceAll("(\"\\w*([Pp]ass|access_token|refresh_token)\\w*\"):\"[^\"]*\"", "$1:\"**removed from output**\"");
    }

    public Optional<String> getBodyAsString()
    {
        if (body instanceof byte[]) {
            return Optional.of(body).map(b -> tryToFilter(new String((byte[])b, StandardCharsets.UTF_8)));
        } else {
            return Optional.ofNullable(body.toString());
        }
    }

    public String getSecuredBody()
    {
        return getBodyAsString().orElse("empty body");
    }
}
