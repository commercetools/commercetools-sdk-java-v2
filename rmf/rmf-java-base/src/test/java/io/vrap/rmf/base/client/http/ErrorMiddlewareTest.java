
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class ErrorMiddlewareTest {

    @DataProvider
    public static Object[][] exceptions() {
        return new Object[][] { { 400, BadRequestException.class }, { 401, UnauthorizedException.class },
                { 403, ForbiddenException.class }, { 404, NotFoundException.class },
                { 409, ConcurrentModificationException.class }, { 499, ApiClientException.class },
                { 500, InternalServerErrorException.class }, { 502, BadGatewayException.class },
                { 503, ServiceUnavailableException.class }, { 504, GatewayTimeoutException.class },
                { 599, ApiServerException.class }, };
    }

    @Test
    @UseDataProvider("exceptions")
    public void testError(int statusCode, Class<ApiHttpException> exceptionClass) {
        ErrorMiddleware middleware = ErrorMiddleware.of(ResponseSerializer.of());

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"), new ApiHttpHeaders(),
            "".getBytes());

        Assertions.assertThatExceptionOfType(exceptionClass).isThrownBy(() -> {
            blockingWait(
                middleware.invoke(request,
                    request1 -> CompletableFuture
                            .completedFuture(new ApiHttpResponse<>(statusCode, new ApiHttpHeaders(), "".getBytes()))),
                Duration.ofSeconds(1));
        }).matches(e -> e.getStatusCode() == statusCode);
    }
}
