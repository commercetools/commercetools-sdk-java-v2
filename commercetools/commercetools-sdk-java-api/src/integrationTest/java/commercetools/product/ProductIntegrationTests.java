
package commercetools.product;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class ProductIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Product product = ProductFixtures.createProduct();
        Assert.assertNotNull(product);

        Product deletedProduct = ProductFixtures.deleteProductById(product.getId(), product.getVersion());
        Assert.assertNotNull(deletedProduct);
    }

    @Test
    public void getById() {
        ProductFixtures.withProduct(product -> {
            Product queriedProduct = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .withId(product.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assert.assertNotNull(queriedProduct);
            Assert.assertEquals(product.getId(), queriedProduct.getId());
        });
    }

    @Test
    public void getByKey() {
        ProductFixtures.withProduct(product -> {
            Product queriedProduct = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .withKey(product.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assert.assertNotNull(queriedProduct);
            Assert.assertEquals(product.getKey(), queriedProduct.getKey());
        });
    }

    @Test
    public void updateById() {
        ProductFixtures.withUpdateableProduct(product -> {
            List<ProductUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(ProductChangeNameActionBuilder.of().name(newName).build());

            Product updatedProduct = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .withId(product.getId())
                    .post(ProductUpdateBuilder.of().actions(updateActions).version(product.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedProduct);

            return updatedProduct;
        });
    }

    @Test
    public void updateByKey() {
        ProductFixtures.withUpdateableProduct(product -> {
            List<ProductUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(ProductChangeNameActionBuilder.of().name(newName).build());

            Product updatedProduct = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .withKey(product.getKey())
                    .post(ProductUpdateBuilder.of().actions(updateActions).version(product.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedProduct);

            return updatedProduct;
        });
    }

    @Test
    public void query() {
        ProductFixtures.withProduct(product -> {
            ProductPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .get()
                    .withWhere("id=" + "\"" + product.getId() + "\"")
                    .executeBlocking()
                    .getBody();
            Assert.assertEquals(response.getResults().size(), 1);
            Assert.assertEquals(response.getResults().get(0).getId(), product.getId());
        });
    }
}
