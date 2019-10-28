package commercetools.product_discount;

import com.commercetools.api.generated.models.product_discount.*;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductDiscountIntegrationTests {
    
    @Test
    public void createAndDelete() throws Exception{
        ProductDiscountDraft productDiscountDraft =  ProductDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .sortOrder("0.4")
                .predicate("product.key=\"random-key\"")
                .value(ProductDiscountValueRelativeDraftBuilder.of().permyriad(1000L).build())
                .isActive(false)
                .build();

        ProductDiscount productDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productDiscounts()
                .post(productDiscountDraft)
                .executeBlocking().getBody();

        System.out.println("ASDF: " + VrapJsonUtils.toJsonString(productDiscount));

        Assert.assertNotNull(productDiscount);
        Assert.assertEquals(productDiscount.getKey(), productDiscountDraft.getKey());

        ProductDiscount deletedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productDiscounts()
                .withId(productDiscount.getId())
                .delete()
                .addVersion(productDiscount.getVersion())
                .executeBlocking().getBody();

        Assert.assertNotNull(deletedProductDiscount);
        Assert.assertEquals(productDiscount.getId(), deletedProductDiscount.getId());
    }
    
    @Test
    public void getById() {
        ProductDiscountFixtures.withProductDiscount(productDiscount -> {
            ProductDiscount queriedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .withId(productDiscount.getId())
                    .get()
                    .executeBlocking().getBody();

            Assert.assertNotNull(queriedProductDiscount);
            Assert.assertEquals(queriedProductDiscount.getId(), productDiscount.getId());
        });
    }

    @Test
    public void getByKey() {
        ProductDiscountFixtures.withProductDiscount(productDiscount -> {
            ProductDiscount queriedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .withKey(productDiscount.getKey())
                    .get()
                    .executeBlocking().getBody();

            Assert.assertNotNull(queriedProductDiscount);
            Assert.assertEquals(queriedProductDiscount.getKey(), productDiscount.getKey());
        });
    }
    
    @Test
    public void query() {
        ProductDiscountFixtures.withProductDiscount(productDiscount -> {
            ProductDiscountPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .get()
                    .addWhere("id=" + "\"" + productDiscount.getId() + "\"")
                    .executeBlocking().getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), productDiscount.getId());
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
                    .executeBlocking().getBody();

            Assert.assertNotNull(updatedProductDiscount);
            Assert.assertEquals(updatedProductDiscount.getKey(), newKey);
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
                    .executeBlocking().getBody();

            Assert.assertNotNull(updatedProductDiscount);
            Assert.assertEquals(updatedProductDiscount.getKey(), newKey);
            return updatedProductDiscount;
        });
    }
    
}
