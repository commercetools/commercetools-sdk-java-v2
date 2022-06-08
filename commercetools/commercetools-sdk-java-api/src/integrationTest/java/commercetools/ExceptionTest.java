
package commercetools;

import java.util.Collections;
import java.util.ConcurrentModificationException;

import com.commercetools.api.client.ApiInternalLoggerFactory;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.error.BadRequestException;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.error.ErrorResponse;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.error.NotFoundException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.event.Level;

public class ExceptionTest {

    @Test
    public void testException() {
        Assertions.assertThatExceptionOfType(NotFoundException.class)
                .isThrownBy(() -> CommercetoolsTestUtils.getProjectApiRoot()
                        .categories()
                        .withKey("unknown-category")
                        .get()
                        .executeBlocking());
    }

    private static ErrorResponse toErrorResponse(ApiHttpException e) {
        return e.getBodyAs(ErrorResponse.class);
    }

    @Test
    public void testErrorResponseBlocking() {
        ApiHttpException e = (ApiHttpException) Assertions.catchThrowable(
            () -> CommercetoolsTestUtils.getProjectApiRoot().carts().post(CartDraft.of()).executeBlocking());

        Assertions.assertThat(e).isInstanceOf(io.vrap.rmf.base.client.error.BadRequestException.class);
        Assertions.assertThat(toErrorResponse(e).getMessage()).isEqualTo("Request body does not contain valid JSON.");
    }

    @Test
    public void testErrorResponse() {
        ApiHttpException e = (ApiHttpException) Assertions
                .catchThrowable(
                    () -> CommercetoolsTestUtils.getProjectApiRoot().carts().post(CartDraft.of()).execute().get())
                .getCause();

        Assertions.assertThat(e).isInstanceOf(io.vrap.rmf.base.client.error.BadRequestException.class);
        Assertions.assertThat(toErrorResponse(e).getMessage()).isEqualTo("Request body does not contain valid JSON.");
    }

    @Test
    public void testApiErrorResponseBlocking() {
        ApiHttpException e = (ApiHttpException) Assertions.catchThrowable(
            () -> CommercetoolsTestUtils.getProjectApiRoot().carts().post(CartDraft.of()).executeBlocking());

        Assertions.assertThat(e).isInstanceOf(BadRequestException.class);
        Assertions.assertThat(((BadRequestException) e).getErrorResponse().getMessage())
                .isEqualTo("Request body does not contain valid JSON.");
    }

    @Test
    public void testApiErrorResponse() {
        ApiHttpException e = (ApiHttpException) Assertions
                .catchThrowable(
                    () -> CommercetoolsTestUtils.getProjectApiRoot().carts().post(CartDraft.of()).execute().get())
                .getCause();
        Assertions.assertThat(e).isInstanceOf(BadRequestException.class);
        Assertions.assertThat(((BadRequestException) e).getErrorResponse().getMessage())
                .isEqualTo("Request body does not contain valid JSON.");
    }

    @Test
    public void testLoggerMiddleware() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get, Level.INFO, // log level for API responses
                    Level.INFO, // log level deprecation notices
                    Level.ERROR, // default log level for exceptions
                    Collections.singletonMap(ConcurrentModificationException.class, Level.DEBUG) // custom log level for specific exceptions
                )
                .build("test");
        Assertions.assertThat(apiRoot).isNotNull();
    }
}
