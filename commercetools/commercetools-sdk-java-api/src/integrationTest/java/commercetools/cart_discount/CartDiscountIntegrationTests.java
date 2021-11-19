
package commercetools.cart_discount;

import static commercetools.cart_discount.CartDiscountFixtures.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.commercetools.api.models.cart_discount.*;
import com.commercetools.api.models.common.ReferenceTypeId;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class CartDiscountIntegrationTests {

    @Test
    public void ref() {
        Optional<ReferenceTypeId> optional = ReferenceTypeId.findEnumViaJsonName("product-type");
        Assert.assertTrue(optional.isPresent());
    }

    @Test
    public void createAndDelete() {
        CartDiscountValueDraft cartDiscountValueDraft = CartDiscountValueRelativeDraftBuilder.of()
                .permyriad(10L)
                .build();

        CartDiscountDraft cartDiscountDraft = CartDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .value(cartDiscountValueDraft)
                .cartPredicate("country=\"DE\"")
                .target(CartDiscountShippingCostTargetBuilder.of().build())
                .sortOrder("0.42")
                .build();

        CartDiscount cartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                .cartDiscounts()
                .post(cartDiscountDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(cartDiscount);
        Assert.assertEquals(cartDiscountDraft.getKey(), cartDiscount.getKey());

        CartDiscount deletedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                .cartDiscounts()
                .withId(cartDiscount.getId())
                .delete()
                .withVersion(cartDiscount.getVersion())
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedCartDiscount);
    }

    @Test
    public void getById() {
        withCartDiscount(cartDiscount -> {
            CartDiscount queriedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .withId(cartDiscount.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedCartDiscount);
            Assert.assertEquals(queriedCartDiscount.getId(), cartDiscount.getId());
        });
    }

    @Test
    public void getByKey() {
        withCartDiscount(cartDiscount -> {
            CartDiscount queriedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .withKey(cartDiscount.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedCartDiscount);
            Assert.assertEquals(queriedCartDiscount.getId(), cartDiscount.getId());
        });
    }

    @Test
    public void query() {
        withCartDiscount(cartDiscount -> {
            CartDiscountPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .get()
                    .withWhere("id=" + "\"" + cartDiscount.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), cartDiscount.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableCartDiscount(cartDiscount -> {
            List<CartDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CartDiscountSetKeyActionBuilder.of().key(newKey).build());
            CartDiscount updatedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .withId(cartDiscount.getId())
                    .post(CartDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(cartDiscount.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedCartDiscount);
            Assert.assertEquals(updatedCartDiscount.getKey(), newKey);

            return updatedCartDiscount;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableCartDiscount(cartDiscount -> {
            List<CartDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CartDiscountSetKeyActionBuilder.of().key(newKey).build());
            CartDiscount updatedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .withKey(cartDiscount.getKey())
                    .post(CartDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(cartDiscount.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedCartDiscount);
            Assert.assertEquals(updatedCartDiscount.getKey(), newKey);

            return updatedCartDiscount;
        });
    }
}
