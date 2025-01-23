
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;
import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.error.ApiHttpExceptionFactory;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ErrorResponse;
import com.commercetools.api.models.error.InvalidJsonInputError;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.*;
import io.vrap.rmf.base.client.http.ErrorMiddleware;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DataProviderExtension.class)
@ExtendWith(UseDataProviderExtension.class)
public class ErrorTest {
    @DataProvider
    public static Object[][] exceptions() {
        return new Object[][] { { 400, BadRequestException.class }, { 401, UnauthorizedException.class },
                { 403, ForbiddenException.class }, { 404, NotFoundException.class },
                { 409, com.commercetools.api.client.error.ConcurrentModificationException.class },
                { 499, ApiClientException.class }, { 500, InternalServerErrorException.class },
                { 502, BadGatewayException.class }, { 503, ServiceUnavailableException.class },
                { 504, GatewayTimeoutException.class }, { 599, ApiServerException.class }, };
    }

    @Test
    public void deprecatedAttributesAccessor() throws IOException {
        ErrorResponse errorResponse = JsonUtils.fromJsonString(stringFromResource("errors.json"), ErrorResponse.class);

        ErrorObject errorObject = errorResponse.getErrors().get(0);
        assertThat(errorObject).isInstanceOf(InvalidJsonInputError.class);

        final InvalidJsonInputError error = (InvalidJsonInputError) errorObject;
        assertThat(error.getDetailedErrorMessage()).isEqualTo("actions -> name: Missing required value");
    }

    @TestTemplate
    @UseDataProvider("exceptions")
    public void testErrorInvalidResponse(int statusCode, Class<ApiHttpException> exceptionClass) {
        ErrorMiddleware middleware = ErrorMiddleware.of(ApiHttpExceptionFactory.of(ResponseSerializer.of()));

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"), new ApiHttpHeaders(),
            "".getBytes());
        final ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(statusCode, null, null);

        Assertions.assertThatExceptionOfType(exceptionClass).isThrownBy(() -> {
            blockingWait(middleware.invoke(request, request1 -> CompletableFuture.completedFuture(response)),
                Duration.ofSeconds(1));
        }).matches(e -> e.getStatusCode() == statusCode);
    }
}
