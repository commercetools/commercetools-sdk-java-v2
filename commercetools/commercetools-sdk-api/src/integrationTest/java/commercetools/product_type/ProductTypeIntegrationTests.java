package commercetools.product_type;

import com.commercetools.api.models.product_type.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeIntegrationTests {

    @Test
    public void createAndDeleteById() {
        ProductType productType = ProductTypeFixtures.createProductType();
        ProductType deleteProductType = ProductTypeFixtures.deleteProductType(productType.getId(), productType.getVersion());

        Assert.assertEquals(productType.getId(), deleteProductType.getId());
    }

    @Test
    public void getById() {
        ProductTypeFixtures.withProductType(productType -> {
            ProductType queriedProductType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productTypes()
                    .withId(productType.getId())
                    .get()
                    .executeBlocking().getBody();

            Assert.assertNotNull(queriedProductType);
            Assert.assertEquals(queriedProductType.getId(), productType.getId());
        });
    }

    @Test
    public void getByKey() {
        ProductTypeFixtures.withProductType(productType -> {
            ProductType queriedProductType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productTypes()
                    .withKey(productType.getKey())
                    .get()
                    .executeBlocking().getBody();

            Assert.assertNotNull(queriedProductType);
            Assert.assertEquals(queriedProductType.getId(), productType.getId());
        });
    }

    @Test
    public void query() {
        ProductTypeFixtures.withProductType(productType -> {
            ProductTypePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
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
        ProductTypeFixtures.withUpdateableProductType(productType -> {
            List<ProductTypeUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ProductTypeSetKeyActionBuilder.of().key(newKey).build());
            ProductType updatedProductType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productTypes()
                    .withId(productType.getId())
                    .post(ProductTypeUpdateBuilder.of()
                            .actions(updateActions)
                            .version(productType.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assert.assertNotNull(updatedProductType);
            Assert.assertEquals(updatedProductType.getKey(), newKey);

            return updatedProductType;
        });
    }

    @Test
    public void updateByKey() {
        ProductTypeFixtures.withUpdateableProductType(productType -> {
            List<ProductTypeUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ProductTypeSetKeyActionBuilder.of().key(newKey).build());
            ProductType updatedProductType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productTypes()
                    .withKey(productType.getKey())
                    .post(ProductTypeUpdateBuilder.of()
                            .actions(updateActions)
                            .version(productType.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assert.assertNotNull(updatedProductType);
            Assert.assertEquals(updatedProductType.getKey(), newKey);

            return updatedProductType;
        });
    }

    @Test
    public void deleteByKey() {
        ProductType productType = ProductTypeFixtures.createProductType();
        ProductType deletedProductType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productTypes()
                .withKey(productType.getKey())
                .delete()
                .withVersion(productType.getVersion())
                .executeBlocking().getBody();

        Assert.assertNotNull(deletedProductType);
    }

}
