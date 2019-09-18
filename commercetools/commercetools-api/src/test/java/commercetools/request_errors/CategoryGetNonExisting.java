package commercetools.request_errors;

import commercetools.category.CategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Test;

public class CategoryGetNonExisting {

    @Test(expected = RuntimeException.class)
    public void getByNonExistingId() {
        CategoryFixtures.withCategory(category -> {
            CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .categories()
                    .withId("non-existing")
                    .get()
                    .executeBlocking().getBody();
        });
    }
}