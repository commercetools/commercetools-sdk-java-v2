
package io.vrap.rmf.base.client.error;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.concurrent.TimeoutException;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class RmfTimeoutException extends BaseException {
    private final ApiHttpRequest request;
    private final String dateAsString = DateTimeFormatter.ISO_INSTANT
            .format(ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC));

    public RmfTimeoutException(final TimeoutException cause) {
        super(cause.getMessage(), cause);
        request = null;
    }

    public RmfTimeoutException(final TimeoutException cause, final ApiHttpRequest request) {
        super(cause.getMessage(), cause);
        this.request = request;
    }

    public ApiHttpRequest getRequest() {
        return request;
    }

    @Override
    public final String getMessage() {
        return Optional.ofNullable(super.getMessage()).map(s -> "detailMessage: " + s + "\n").orElse("") + httpSummary()
                + Optional.ofNullable(request)
                        .map(x -> "" + x.getMethod() + " " + x.getUri())
                        .map(x -> "endpoint: " + x + "\n")
                        .orElse("")
                + "Java: " + System.getProperty("java.version") + "\n" + "cwd: " + System.getProperty("user.dir") + "\n"
                + "request: " + Optional.ofNullable(request).map(Object::toString).orElse("<unknown>") + "\n"
                + httpRequestLine() + requestBodyFormatted();
    }

    private String httpSummary() {
        try {
            final StringBuilder builder = new StringBuilder();
            if (this.request != null) {
                builder.append("summary: ");
                final String httpMethod = Optional.of(this.request)
                        .map(r -> r.getMethod().toString())
                        .orElseGet(() -> this.request.getMethod().toString());

                final String path = Optional.of(this.request)
                        .map(ApiHttpRequest::getUri)
                        .orElseGet(this.request::getUri)
                        .toString();

                builder.append(httpMethod)
                        .append(" ")
                        .append(path)
                        .append(" failed ")
                        .append(" on ")
                        .append(dateAsString)
                        .append("\n");
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

    private String requestBodyFormatted() {
        try {
            final Optional<String> stringBodyOfHttpRequest = stringBodyOfHttpRequest();
            final Optional<String> stringBodyOfHttpRequestIntentSupplier = Optional.ofNullable(request)
                    .map(ApiHttpRequest::getSecuredBody);
            return Optional
                    .ofNullable(stringBodyOfHttpRequest.orElse(stringBodyOfHttpRequestIntentSupplier.orElse(null)))
                    .map(JsonUtils::prettyPrint)
                    .map(s -> "http request formatted body: " + s + "\n")
                    .orElse("");
        }
        catch (final Exception e) {
            return "";
        }
    }

    private Optional<String> stringBodyOfHttpRequest() {
        return Optional.ofNullable(request).map(ApiHttpRequest::getSecuredBody);
    }
}
