
package io.vrap.rmf.base.client;

import java.nio.charset.StandardCharsets;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.error.BaseException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class ApiHttpException extends BaseException {

    private final int statusCode;
    @Nullable
    private final String body;
    @Nullable
    private final ApiHttpHeaders headers;
    @Nullable
    private final ApiHttpResponse<byte[]> response;
    @Nullable
    private final ApiHttpRequest request;

    private final String dateAsString = DateTimeFormatter.ISO_INSTANT.format(
        ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC));

    public ApiHttpException(final int statusCode, final String body, final ApiHttpHeaders headers) {
        this(statusCode, body, headers, null, null, null);
    }

    public ApiHttpException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final ApiHttpResponse<byte[]> response) {
        this(statusCode, body, headers, null, response, null);
    }

    public ApiHttpException(final int statusCode, final String body, final ApiHttpHeaders headers, final String message,
            final ApiHttpResponse<byte[]> response) {
        this(statusCode, body, headers, message, response, null);
    }

    public ApiHttpException(final int statusCode, @Nullable final String body, @Nullable final ApiHttpHeaders headers,
            @Nullable final String message, @Nullable final ApiHttpResponse<byte[]> response,
            @Nullable final ApiHttpRequest request) {
        super(message);
        this.statusCode = statusCode;
        this.body = body;
        this.headers = headers;
        this.response = response;
        this.request = request;
    }

    public <T> T getBodyAs(Class<T> clazz) throws SerializationException {
        try {
            return JsonUtils.getConfiguredObjectMapper().readValue(body, clazz);
        }
        catch (Exception e) {
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

    public ApiHttpResponse<byte[]> getResponse() {
        return response;
    }

    @Override
    public final String getMessage() {
        return Optional.ofNullable(super.getMessage()).map(s -> "detailMessage: " + s + "\n").orElse("") + httpSummary()
                + responseBodyFormatted() + "http response: "
                + Optional.ofNullable(getResponse()).map(Object::toString).orElse("<unknown>") + "\n" + "SDK: "
                + BuildInfo.VERSION + "\n"
                + Optional.ofNullable(request).map(x -> "" + x.getMethod() + " " + x.getUri()).map(
                    x -> "endpoint: " + x + "\n").orElse("")
                + "Java: " + System.getProperty("java.version") + "\n" + "cwd: " + System.getProperty("user.dir") + "\n"
                + "request: " + Optional.ofNullable(request).map(Object::toString).orElse("<unknown>") + "\n"
                + httpRequestLine() + requestBodyFormatted();
    }

    private String httpSummary() {
        try {
            final StringBuilder builder = new StringBuilder();
            if (this.request != null) {
                builder.append("summary: ");
                final String httpMethod = Optional.of(this.request).map(r -> r.getMethod().toString()).orElseGet(
                    () -> this.request.getMethod().toString());

                final String path = Optional.of(this.request).map(ApiHttpRequest::getUri).orElseGet(
                    this.request::getUri).toString();

                final String responseCode = " with "
                        + Optional.ofNullable(this.response).map(ApiHttpResponse::getStatusCode).map(
                            Object::toString).map(r -> "response code " + r).orElse("an unknown status code");

                final String correlationId = Optional.ofNullable(this.response).map(
                    ApiHttpResponse::getHeaders).flatMap(
                        headers -> headers.getHeaders(ApiHttpHeaders.X_CORRELATION_ID).stream().findFirst()).map(
                            id -> " with " + ApiHttpHeaders.X_CORRELATION_ID + " `" + id + "`").orElse("");

                builder.append(httpMethod).append(" ").append(path).append(" failed ").append(responseCode).append(
                    correlationId).append(" on ").append(dateAsString).append("\n");
            }
            return builder.toString();
        }
        catch (final Exception e) {
            return "";
        }
    }

    private String httpRequestLine() {
        if (request == null) {
            return "";
        }
        else {
            return "http request: " + request.toString() + "\n";
        }
    }

    private String responseBodyFormatted() {
        try {
            return Optional.ofNullable(response).map(ApiHttpResponse::getBody).map(
                b -> JsonUtils.prettyPrint(new String(b, StandardCharsets.UTF_8))).map(
                    s -> "http response formatted body: " + s + "\n").orElse("");
        }
        catch (final Exception e) {
            return "";
        }
    }

    private String requestBodyFormatted() {
        try {
            final Optional<String> stringBodyOfHttpRequest = stringBodyOfHttpRequest();
            final Optional<String> stringBodyOfHttpRequestIntentSupplier = Optional.ofNullable(request).map(
                ApiHttpRequest::getSecuredBody);
            return Optional.ofNullable(
                stringBodyOfHttpRequest.orElse(stringBodyOfHttpRequestIntentSupplier.orElse(null))).map(
                    JsonUtils::prettyPrint).map(s -> "http request formatted body: " + s + "\n").orElse("");
        }
        catch (final Exception e) {
            return "";
        }
    }

    private Optional<String> stringBodyOfHttpRequest() {
        return Optional.ofNullable(request).map(ApiHttpRequest::getSecuredBody);
    }
}
