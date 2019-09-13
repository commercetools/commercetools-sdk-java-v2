package commercetools.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.*;
import commercetools.product_type.ProductTypeFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductIntegrationTests {
    
    @Test
    public void createAndDeleteById() {
        ProductTypeFixtures.withProductType(productType -> {
            Product product = ProductFixtures.createProduct(productType);
            Assertions.assertNotNull(product);

            Product deletedProduct = ProductFixtures.deleteProductById(product.getId(), product.getVersion());
            Assertions.assertNotNull(deletedProduct);
        });
    }
    
    @Test
    public void getById() {
        ProductFixtures.withProduct(product -> {
            Product queriedProduct = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .products()
                    .withId(product.getId())
                    .get()
                    .executeBlocking().getBody();
            Assertions.assertNotNull(queriedProduct);
            Assertions.assertEquals(product.getId(), queriedProduct.getId());
        });
    }
    
    @Test
    public void getByKey() {
        ProductFixtures.withProduct(product -> {
            Product queriedProduct = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .products()
                    .withKey(product.getKey())
                    .get()
                    .executeBlocking().getBody();
            Assertions.assertNotNull(queriedProduct);
            Assertions.assertEquals(product.getKey(), queriedProduct.getKey());
        });
    }
    
    @Test
    public void updateById(){
        ProductFixtures.withUpdateableProduct(product -> {
            List<ProductUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(ProductChangeNameActionBuilder.of().name(newName).build());
            
            Product updatedProduct = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .products()
                    .withId(product.getId())
                    .post(ProductUpdateBuilder.of()
                            .actions(updateActions)
                            .version(product.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedProduct);
            
            return updatedProduct;
        });
    }

    @Test
    public void updateByKey(){
        ProductFixtures.withUpdateableProduct(product -> {
            List<ProductUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(ProductChangeNameActionBuilder.of().name(newName).build());

            Product updatedProduct = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .products()
                    .withKey(product.getKey())
                    .post(ProductUpdateBuilder.of()
                            .actions(updateActions)
                            .version(product.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedProduct);

            return updatedProduct;
        });
    }
    
    @Test
    public void query() {
        ProductFixtures.withProduct(product -> {
            ProductPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .products()
                    .get()
                    .addWhere("id=" + "\"" + product.getId() + "\"")
                    .executeBlocking().getBody();
            Assertions.assertEquals(response.getResults().size(), 1);
            Assertions.assertEquals(response.getResults().get(0).getId(), product.getId());
        });
    }
}