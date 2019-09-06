package commercetools.product_projection;

import com.commercetools.models.Product.ProductProjection;
import com.commercetools.models.Product.ProductProjectionPagedQueryResponse;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductProjectionIntegrationTests {
    
    @Test
    public void getById() {
        ProductFixtures.withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productProjections()
                    .withId(product.getId())
                    .get()
                    .addStaged(true)
                    .executeBlocking();

            Assertions.assertEquals(productProjection.getId(), product.getId());
        });
    }

    @Test
    public void getByKey() {
        ProductFixtures.withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productProjections()
                    .withKey(product.getKey())
                    .get()
                    .addStaged(true)
                    .executeBlocking();

            Assertions.assertEquals(productProjection.getKey(), product.getKey());
        });
    }
    
    @Test
    public void query() {
        ProductFixtures.withProduct(product -> {
            ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productProjections()
                    .get()
                    .addStaged(true)
                    .addWhere("id=" + "\"" + product.getId() +  "\"")
                    .executeBlocking();

            Assertions.assertEquals(productProjectionPagedQueryResponse.getResults().get(0).getId(), product.getId());
        });
    }
}