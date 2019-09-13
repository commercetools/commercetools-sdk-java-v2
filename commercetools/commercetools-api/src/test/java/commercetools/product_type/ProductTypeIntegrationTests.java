package commercetools.product_type;

import com.commercetools.models.product_type.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeIntegrationTests {
    
    @Test
    public void createAndDeleteById() {
        ProductType productType = ProductTypeFixtures.createProductType();
        ProductType deleteProductType = ProductTypeFixtures.deleteProductType(productType.getId(), productType.getVersion());

        Assertions.assertEquals(productType.getId(), deleteProductType.getId());
    }
    
    @Test
    public void getById() {
        ProductTypeFixtures.withProductType(productType -> {
            ProductType queriedProductType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productTypes()
                    .withId(productType.getId())
                    .get()
                    .executeBlocking().getBody();
            
            Assertions.assertNotNull(queriedProductType);
            Assertions.assertEquals(queriedProductType.getId(), productType.getId());
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

            Assertions.assertNotNull(queriedProductType);
            Assertions.assertEquals(queriedProductType.getId(), productType.getId());
        });
    }
    
    @Test
    public void query() {
        ProductTypeFixtures.withProductType(productType -> {
            ProductTypePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productTypes()
                    .get()
                    .addWhere("id=" + "\"" + productType.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), productType.getId());
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

            Assertions.assertNotNull(updatedProductType);
            Assertions.assertEquals(updatedProductType.getKey(), newKey);
            
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

            Assertions.assertNotNull(updatedProductType);
            Assertions.assertEquals(updatedProductType.getKey(), newKey);

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
                .addVersion(productType.getVersion())
                .executeBlocking().getBody();
        
        Assertions.assertNotNull(deletedProductType);
    }
    
}
