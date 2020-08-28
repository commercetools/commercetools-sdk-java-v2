package commercetools.product_projection;

import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedQueryResponse;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;
import org.junit.Test;

public class ProductProjectionIntegrationTests {

    @Test
    public void getById() {
        ProductFixtures.withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getProjectRoot()
                    .productProjections()
                    .withId(product.getId())
                    .get()
                    .withStaged(true)
                    .executeBlocking().getBody();

            Assert.assertEquals(productProjection.getId(), product.getId());
        });
    }

    @Test
    public void getByKey() {
        ProductFixtures.withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getProjectRoot()
                    .productProjections()
                    .withKey(product.getKey())
                    .get()
                    .withStaged(true)
                    .executeBlocking().getBody();

            Assert.assertEquals(productProjection.getKey(), product.getKey());
        });
    }

    @Test
    public void query() {
        ProductFixtures.withProduct(product -> {
            ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = CommercetoolsTestUtils.getProjectRoot()
                    .productProjections()
                    .get()
                    .withStaged(true)
                    .withWhere("id=" + "\"" + product.getId() +  "\"")
                    .executeBlocking().getBody();

            Assert.assertEquals(productProjectionPagedQueryResponse.getResults().get(0).getId(), product.getId());
        });
    }
}
