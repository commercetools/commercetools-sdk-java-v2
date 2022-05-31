
package io.sphere.sdk.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.sphere.sdk.http.HttpResponse;
import io.sphere.sdk.json.SphereJsonUtils;
import io.sphere.sdk.models.SphereException;
import io.sphere.sdk.models.errors.ErrorResponse;

public class CompatExceptionFactory {

    private final List<HttpResponseExceptionResponsibility> responsibilities = new ArrayList<>();

    CompatExceptionFactory() {
    }

    private CompatExceptionFactory when(final Predicate<HttpResponse> predicate,
            final Function<HttpResponse, SphereException> exceptionCreator) {
        return this.addResponsibility(predicate, exceptionCreator);
    }

    private CompatExceptionFactory addResponsibility(final Predicate<HttpResponse> predicate,
            final Function<HttpResponse, SphereException> exceptionCreator) {
        HttpResponseExceptionResponsibility r = new HttpResponseExceptionResponsibility(predicate, exceptionCreator);
        this.responsibilities.add(r);
        return this;
    }

    private CompatExceptionFactory whenStatus(final int status,
            final Function<HttpResponse, SphereException> exceptionCreator) {
        return this.addResponsibility((response) -> {
            return response.getStatusCode() == status;
        }, (response) -> {
            return (SphereException) exceptionCreator.apply(response);
        });
    }

    private static String extractBody(final HttpResponse httpResponse) {
        return (String) Optional.ofNullable(httpResponse.getResponseBody()).map((b) -> {
            return HttpResponseBodyUtils.bytesToString(b);
        }).orElse("");
    }

    public static CompatExceptionFactory of() {
        CompatExceptionFactory exceptionFactory = (new CompatExceptionFactory()).when((r) -> {
            return isServiceNotAvailable(r);
        }, (r) -> {
            return new ServiceUnavailableException(extractBody(r));
        }).whenStatus(401, (r) -> {
            String body = extractBody(r);
            return (SphereException) (body.contains("invalid_token") ? new InvalidTokenException()
                    : new UnauthorizedException(body, 401));
        }).whenStatus(403, (r) -> {
            return new ForbiddenException(extractBody(r));
        }).whenStatus(500, (r) -> {
            return new InternalServerErrorException(extractBody(r));
        }).whenStatus(502, (r) -> {
            return new BadGatewayException(extractBody(r));
        }).whenStatus(503, (r) -> {
            return new ServiceUnavailableException(extractBody(r));
        }).whenStatus(504, (r) -> {
            return new GatewayTimeoutException(extractBody(r));
        }).whenStatus(409, (r) -> {
            ErrorResponse errorResponse = (ErrorResponse) SphereJsonUtils.readObject(r.getResponseBody(),
                ErrorResponse.typeReference());
            return new ConcurrentModificationException(errorResponse);
        }).whenStatus(413, (r) -> {
            return new RequestEntityTooLargeException();
        }).whenStatus(400, (r) -> {
            String body = extractBody(r);
            if (body.contains("invalid_scope")) {
                return new InvalidTokenException();
            }
            else {
                ErrorResponse errorResponse = (ErrorResponse) SphereJsonUtils.readObject(r.getResponseBody(),
                    ErrorResponse.typeReference());
                return new ErrorResponseException(errorResponse);
            }
        }).whenStatus(404, (r) -> {
            return new NotFoundException();
        }).when((response) -> {
            return true;
        }, (r) -> {
            return new SphereException("Can't parse backend response.");
        });
        return exceptionFactory;
    }

    private static boolean isServiceNotAvailable(final HttpResponse httpResponse) {
        return httpResponse.getStatusCode() == 503
                || (Boolean) Optional.ofNullable(httpResponse.getResponseBody()).map((b) -> {
                    return HttpResponseBodyUtils.bytesToString(b);
                }).map((s) -> {
                    return s.contains("<h2>Service Unavailable</h2>");
                }).orElse(false);
    }

    public <T> SphereException createException(final HttpResponse httpResponse, final SphereRequest<T> sphereRequest,
            final ObjectMapper objectMapper) {
        HttpResponseExceptionResponsibility responsibility = (HttpResponseExceptionResponsibility) this.responsibilities
                .stream()
                .filter((x) -> {
                    return x.getPredicate().test(httpResponse);
                })
                .findFirst()
                .get();
        return (SphereException) responsibility.getExceptionCreator().apply(httpResponse);
    }
}
