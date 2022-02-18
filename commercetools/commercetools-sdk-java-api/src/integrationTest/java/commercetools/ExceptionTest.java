
package commercetools;

import com.commercetools.api.client.error.BadRequestException;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.error.ErrorResponse;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.error.NotFoundException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
