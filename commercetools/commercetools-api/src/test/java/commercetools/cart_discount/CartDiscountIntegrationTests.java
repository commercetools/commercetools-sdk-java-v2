package commercetools.cart_discount;

import com.commercetools.models.CartDiscount.*;
import com.commercetools.models.Common.ReferenceTypeId;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CartDiscountIntegrationTests {
    
    @Test
    public void ref(){
        Optional<ReferenceTypeId> optional = ReferenceTypeId.findEnumViaJsonName("product-type");
        Assertions.assertTrue(optional.isPresent());
    }
    
    @Test
    public void createAndDelete() {
        CartDiscountValue cartDiscountValue = CartDiscountValueRelativeBuilder.of()
                .permyriad(10L)
                .build();

        CartDiscountDraft cartDiscountDraft = CartDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .value(cartDiscountValue)
                .cartPredicate("country=\"DE\"")
                .target(CartDiscountShippingCostTargetBuilder.of().build())
                .sortOrder("0.42")
                .build();

        CartDiscount cartDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .cartDiscounts()
                .post(cartDiscountDraft)
                .executeBlocking().getBody();

        Assertions.assertNotNull(cartDiscount);
        Assertions.assertEquals(cartDiscountDraft.getKey(), cartDiscount.getKey());
        
        CartDiscount deletedCartDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .cartDiscounts()
                .withId(cartDiscount.getId())
                .delete()
                .addVersion(cartDiscount.getVersion())
                .executeBlocking().getBody();

        Assertions.assertNotNull(deletedCartDiscount);
    }
    
    @Test
    public void getById() {
        CartDiscountFixtures.withCartDiscount(cartDiscount -> {
            CartDiscount queriedCartDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .cartDiscounts()
                    .withId(cartDiscount.getId())
                    .get()
                    .executeBlocking().getBody();

            Assertions.assertNotNull(queriedCartDiscount);
            Assertions.assertEquals(queriedCartDiscount.getId(), cartDiscount.getId());
        });
    }

    @Test
    public void getByKey() {
        CartDiscountFixtures.withCartDiscount(cartDiscount -> {
            CartDiscount queriedCartDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .cartDiscounts()
                    .withKey(cartDiscount.getKey())
                    .get()
                    .executeBlocking().getBody();

            Assertions.assertNotNull(queriedCartDiscount);
            Assertions.assertEquals(queriedCartDiscount.getId(), cartDiscount.getId());
        });
    }

    @Test
    public void query() {
        CartDiscountFixtures.withCartDiscount(cartDiscount -> {
            CartDiscountPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .cartDiscounts()
                    .get()
                    .addWhere("id=" + "\"" + cartDiscount.getId() + "\"")
                    .executeBlocking().getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), cartDiscount.getId());
        });
    }

    @Test
    public void updateById() {
        CartDiscountFixtures.withUpdateableCartDiscount(cartDiscount -> {
            List<CartDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CartDiscountSetKeyActionBuilder.of().key(newKey).build());
            CartDiscount updatedCartDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .cartDiscounts()
                    .withId(cartDiscount.getId())
                    .post(CartDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(cartDiscount.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedCartDiscount);
            Assertions.assertEquals(updatedCartDiscount.getKey(), newKey);
            
            return updatedCartDiscount;
        });
    }

    @Test
    public void updateByKey() {
        CartDiscountFixtures.withUpdateableCartDiscount(cartDiscount -> {
            List<CartDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CartDiscountSetKeyActionBuilder.of().key(newKey).build());
            CartDiscount updatedCartDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .cartDiscounts()
                    .withKey(cartDiscount.getKey())
                    .post(CartDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(cartDiscount.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedCartDiscount);
            Assertions.assertEquals(updatedCartDiscount.getKey(), newKey);

            return updatedCartDiscount;
        });
    }
}
