package commercetools.product_discount;

import com.commercetools.models.ProductDiscount.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductDiscountIntegrationTests {
    
    @Test
    public void createAndDelete() {
        ProductDiscountDraft productDiscountDraft =  ProductDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .sortOrder("0.4")
                .predicate("product.key=\"random-key\"")
                .value(ProductDiscountValueExternalBuilder.of().build())
                .isActive(false)
                .build();

        ProductDiscount productDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productDiscounts()
                .post(productDiscountDraft)
                .executeBlocking();

        Assertions.assertNotNull(productDiscount);
        Assertions.assertEquals(productDiscount.getKey(), productDiscountDraft.getKey());

        ProductDiscount deletedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productDiscounts()
                .withId(productDiscount.getId())
                .delete()
                .addVersion(productDiscount.getVersion())
                .executeBlocking();

        Assertions.assertNotNull(deletedProductDiscount);
        Assertions.assertEquals(productDiscount.getId(), deletedProductDiscount.getId());
    }
    
    @Test
    public void getById() {
        ProductDiscountFixtures.withProductDiscount(productDiscount -> {
            ProductDiscount queriedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .withId(productDiscount.getId())
                    .get()
                    .executeBlocking();

            Assertions.assertNotNull(queriedProductDiscount);
            Assertions.assertEquals(queriedProductDiscount.getId(), productDiscount.getId());
        });
    }

    @Test
    public void getByKey() {
        ProductDiscountFixtures.withProductDiscount(productDiscount -> {
            ProductDiscount queriedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .withKey(productDiscount.getKey())
                    .get()
                    .executeBlocking();

            Assertions.assertNotNull(queriedProductDiscount);
            Assertions.assertEquals(queriedProductDiscount.getKey(), productDiscount.getKey());
        });
    }
    
    @Test
    public void query() {
        ProductDiscountFixtures.withProductDiscount(productDiscount -> {
            ProductDiscountPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .get()
                    .addWhere("id=" + "\"" + productDiscount.getId() + "\"")
                    .executeBlocking();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), productDiscount.getId());
        });
    }

    @Test
    public void updateById() {
        ProductDiscountFixtures.withUpdateableProductDiscount(productDiscount -> {
            List<ProductDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ProductDiscountSetKeyActionBuilder.of().key(newKey).build());
            ProductDiscount updatedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .withId(productDiscount.getId())
                    .post(ProductDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(productDiscount.getVersion())
                            .build())
                    .executeBlocking();

            Assertions.assertNotNull(updatedProductDiscount);
            Assertions.assertEquals(updatedProductDiscount.getKey(), newKey);
            return updatedProductDiscount; 
        });
    }

    @Test
    public void updateByKey() {
        ProductDiscountFixtures.withUpdateableProductDiscount(productDiscount -> {
            List<ProductDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ProductDiscountSetKeyActionBuilder.of().key(newKey).build());
            ProductDiscount updatedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .withKey(productDiscount.getKey())
                    .post(ProductDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(productDiscount.getVersion())
                            .build())
                    .executeBlocking();

            Assertions.assertNotNull(updatedProductDiscount);
            Assertions.assertEquals(updatedProductDiscount.getKey(), newKey);
            return updatedProductDiscount;
        });
    }
    
}
