
package commercetools.product_discount;

import static commercetools.product_discount.ProductDiscountFixtures.*;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.product_discount.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductDiscountIntegrationTests {

    @Test
    public void createAndDelete() {
        ProductDiscountDraft productDiscountDraft = ProductDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .description(CommercetoolsTestUtils.randomLocalizedString())
                .value(ProductDiscountValueRelativeDraftBuilder.of().permyriad(1000L).build())
                .predicate("product.key=\"random-key\"")
                .sortOrder("0.4")
                .isActive(false)
                .validFrom(ZonedDateTime.now().plus(1, ChronoUnit.HOURS))
                .validUntil(ZonedDateTime.now().plus(3, ChronoUnit.HOURS))
                .build();

        ProductDiscount productDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                .productDiscounts()
                .post(productDiscountDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(productDiscount);
        Assertions.assertEquals(productDiscount.getKey(), productDiscountDraft.getKey());

        ProductDiscount deletedProductDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                .productDiscounts()
                .withId(productDiscount.getId())
                .delete()
                .withVersion(productDiscount.getVersion())
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedProductDiscount);
        Assertions.assertEquals(productDiscount.getId(), deletedProductDiscount.getId());
    }

    @Test
    public void getById() {
        withProductDiscount(productDiscount -> {
            ProductDiscount queriedProductDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .productDiscounts()
                    .withId(productDiscount.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedProductDiscount);
            Assertions.assertEquals(queriedProductDiscount.getId(), productDiscount.getId());
        });
    }

    @Test
    public void getByKey() {
        withProductDiscount(productDiscount -> {
            ProductDiscount queriedProductDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .productDiscounts()
                    .withKey(productDiscount.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedProductDiscount);
            Assertions.assertEquals(queriedProductDiscount.getKey(), productDiscount.getKey());
        });
    }

    @Test
    public void query() {
        withProductDiscount(productDiscount -> {
            ProductDiscountPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .productDiscounts()
                    .get()
                    .withWhere("id=" + "\"" + productDiscount.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), productDiscount.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableProductDiscount(productDiscount -> {
            List<ProductDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ProductDiscountSetKeyActionBuilder.of().key(newKey).build());
            ProductDiscount updatedProductDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .productDiscounts()
                    .withId(productDiscount.getId())
                    .post(ProductDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(productDiscount.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedProductDiscount);
            Assertions.assertEquals(updatedProductDiscount.getKey(), newKey);
            return updatedProductDiscount;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableProductDiscount(productDiscount -> {
            List<ProductDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ProductDiscountSetKeyActionBuilder.of().key(newKey).build());
            ProductDiscount updatedProductDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .productDiscounts()
                    .withKey(productDiscount.getKey())
                    .post(ProductDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(productDiscount.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedProductDiscount);
            Assertions.assertEquals(updatedProductDiscount.getKey(), newKey);
            return updatedProductDiscount;
        });
    }

}
