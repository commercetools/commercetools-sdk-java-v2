
package io.vrap.rmf.base.client;

import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ApiHttpResponse<U> extends Base {

    private int statusCode;
    private ApiHttpHeaders headers;
    private U body;
    private String message;

    public ApiHttpResponse(final int statusCode, final ApiHttpHeaders headers, final U body) {
        this(statusCode, headers, body, null);
    }

    public ApiHttpResponse(final int statusCode, final ApiHttpHeaders headers, final U body, final String message) {
        this.statusCode = statusCode;
        this.headers = Optional.ofNullable(headers).orElse(new ApiHttpHeaders());
        this.body = body;
        this.message = message;
    }

    public ApiHttpResponse(final ApiHttpResponse<U> response) {
        this.statusCode = response.statusCode;
        this.headers = response.headers;
        this.body = response.body;
        this.message = response.message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public ApiHttpResponse<U> withStatusCode(final int statusCode) {
        ApiHttpResponse<U> response = copy();
        response.statusCode = statusCode;

        return response;
    }

    public ApiHttpHeaders getHeaders() {
        return headers;
    }

    public ApiHttpResponse<U> withHeaders(final ApiHttpHeaders headers) {
        ApiHttpResponse<U> response = copy();
        response.headers = headers;

        return response;
    }

    public U getBody() {
        return body;
    }

    public ApiHttpResponse<U> withBody(final U body) {
        ApiHttpResponse<U> response = copy();
        response.body = body;

        return response;
    }

    public String getMessage() {
        return message;
    }

    public ApiHttpResponse<U> withMessage(final String message) {
        ApiHttpResponse<U> response = copy();
        response.message = message;

        return response;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statusCode", statusCode)
                .append("headers", headers)
                .append("textInterpretedBody", getSecuredBody())
                .toString();
    }

    static String tryToFilter(final String input) {
        return input.replaceAll("(\"\\w*([Pp]ass|access_token|refresh_token)\\w*\"):\"[^\"]*\"",
            "$1:\"**removed from output**\"");
    }

    public Optional<String> getBodyAsString() {
        if (body instanceof byte[]) {
            return Optional.of(body).map(b -> tryToFilter(new String((byte[]) b, StandardCharsets.UTF_8)));
        }
        else {
            return Optional.ofNullable(body.toString());
        }
    }

    public String getSecuredBody() {
        return getBodyAsString().orElse("empty body");
    }

    private ApiHttpResponse<U> copy() {
        return new ApiHttpResponse<>(this);
    }
}
