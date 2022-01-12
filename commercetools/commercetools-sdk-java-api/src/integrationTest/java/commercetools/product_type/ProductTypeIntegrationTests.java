
package commercetools.product_type;

import static commercetools.product_type.ProductTypeFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.product_type.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProductTypeIntegrationTests {

    @Test
    public void createAndDeleteById() {
        ProductType productType = createProductType();
        ProductType deleteProductType = deleteProductType(productType.getId(), productType.getVersion());

        Assert.assertEquals(productType.getId(), deleteProductType.getId());
    }

    @Test
    public void getById() {
        withProductType(productType -> {
            ProductType queriedProductType = CommercetoolsTestUtils.getProjectApiRoot()
                    .productTypes()
                    .withId(productType.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedProductType);
            Assert.assertEquals(queriedProductType.getId(), productType.getId());
        });
    }

    @Test
    public void getByKey() {
        withProductType(productType -> {
            ProductType queriedProductType = CommercetoolsTestUtils.getProjectApiRoot()
                    .productTypes()
                    .withKey(productType.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedProductType);
            Assert.assertEquals(queriedProductType.getId(), productType.getId());
        });
    }

    @Test
    public void query() {
        withProductType(productType -> {
            ProductTypePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .productTypes()
                    .get()
                    .withWhere("id=" + "\"" + productType.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), productType.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableProductType(productType -> {
            List<ProductTypeUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ProductTypeSetKeyActionBuilder.of().key(newKey).build());
            ProductType updatedProductType = CommercetoolsTestUtils.getProjectApiRoot()
                    .productTypes()
                    .withId(productType.getId())
                    .post(
                        ProductTypeUpdateBuilder.of().actions(updateActions).version(productType.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedProductType);
            Assert.assertEquals(updatedProductType.getKey(), newKey);

            return updatedProductType;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableProductType(productType -> {
            List<ProductTypeUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ProductTypeSetKeyActionBuilder.of().key(newKey).build());
            ProductType updatedProductType = CommercetoolsTestUtils.getProjectApiRoot()
                    .productTypes()
                    .withKey(productType.getKey())
                    .post(
                        ProductTypeUpdateBuilder.of().actions(updateActions).version(productType.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedProductType);
            Assert.assertEquals(updatedProductType.getKey(), newKey);

            return updatedProductType;
        });
    }

    @Test
    public void deleteByKey() {
        ProductType productType = createProductType();
        ProductType deletedProductType = CommercetoolsTestUtils.getProjectApiRoot()
                .productTypes()
                .withKey(productType.getKey())
                .delete()
                .withVersion(productType.getVersion())
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedProductType);
    }

}
