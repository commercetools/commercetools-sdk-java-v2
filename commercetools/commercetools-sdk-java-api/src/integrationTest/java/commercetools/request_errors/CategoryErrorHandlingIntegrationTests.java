
package commercetools.request_errors;

import com.commercetools.api.models.error.ErrorResponse;
import commercetools.category.CategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.error.BadRequestException;
import io.vrap.rmf.base.client.error.NotFoundException;

import org.junit.Assert;
import org.junit.Test;

public class CategoryErrorHandlingIntegrationTests {

    @Test(expected = RuntimeException.class)
    public void getByNonExistingIdBlocking() {
        CategoryFixtures.withCategory(category -> {
            CommercetoolsTestUtils.getProjectRoot()
                    .categories()
                    .withId("non-existing")
                    .get()
                    .executeBlocking()
                    .getBody();
        });
    }

    @Test
    public void getByNonExistingIdNonBlocking() {
        CategoryFixtures.withCategory(category -> {
            CommercetoolsTestUtils.getProjectRoot()
                    .categories()
                    .withId("non-existing")
                    .get()
                    .execute()
                    .exceptionally(throwable -> {
                        if (throwable.getCause() instanceof NotFoundException) {
                            NotFoundException apiHttpException = (NotFoundException) throwable.getCause();
                            Assert.assertEquals(apiHttpException.getStatusCode(), 404);
                        }
                        return null;
                    });
        });
    }

    @Test
    public void deleteWithoutVersionNonBlocking() {
        CategoryFixtures.withUpdateableCategory(category -> {
            CommercetoolsTestUtils.getProjectRoot()
                    .categories()
                    .withId(category.getId())
                    .delete()
                    .execute()
                    .exceptionally(throwable -> {
                        if (throwable.getCause() instanceof BadRequestException) {
                            BadRequestException apiHttpException = (BadRequestException) throwable.getCause();
                            ErrorResponse errorResponse = apiHttpException.getBodyAs(ErrorResponse.class);
                            Assert.assertEquals(errorResponse.getStatusCode(), Integer.valueOf(400));
                        }
                        return null;
                    });
            return category;
        });
    }

    @Test
    public void deleteWithoutVersionBlocking() {
        CategoryFixtures.withUpdateableCategory(category -> {
            try {
                CommercetoolsTestUtils.getProjectRoot()
                        .categories()
                        .withId(category.getId())
                        .delete()
                        .executeBlocking();
            }
            catch (BadRequestException exception) {
                ErrorResponse errorResponse = exception.getBodyAs(ErrorResponse.class);
                Assert.assertEquals(errorResponse.getStatusCode(), Integer.valueOf(400));
            }
            return category;
        });
    }
}
