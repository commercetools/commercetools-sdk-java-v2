package commercetools.cart_discount;

import com.commercetools.models.cart_discount.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CartDiscountFixtures {
    
    public static void withCartDiscount(final Consumer<CartDiscount> consumer) {
        CartDiscount cartDiscount = createCartDiscount();
        consumer.accept(cartDiscount);
        deleteCartDiscount(cartDiscount.getId(), cartDiscount.getVersion());
    }
    
    public static void withUpdateableCartDiscount(final UnaryOperator<CartDiscount> operator) {
        CartDiscount cartDiscount = createCartDiscount();
        cartDiscount = operator.apply(cartDiscount);
        deleteCartDiscount(cartDiscount.getId(), cartDiscount.getVersion());
    }
    
    public static CartDiscount createCartDiscount() {
        CartDiscountValueDraft cartDiscountValueDraft = CartDiscountValueRelativeDraftBuilder.of()
                .permyriad(10L)
                .build();

        CartDiscountDraft cartDiscountDraft = CartDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .value(cartDiscountValueDraft)
                .cartPredicate("country=\"DE\"")
                .target(CartDiscountShippingCostTargetBuilder.of().build())
                .sortOrder("0.41")
                .requiresDiscountCode(true)
                .build();

        CartDiscount cartDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .cartDiscounts()
                .post(cartDiscountDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(cartDiscount);
        Assert.assertEquals(cartDiscountDraft.getKey(), cartDiscount.getKey());
        
        return cartDiscount;
    }
    
    public static CartDiscount deleteCartDiscount(final String id, final Long version) {
        CartDiscount deletedCartDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .cartDiscounts()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(deletedCartDiscount);
        
        return deletedCartDiscount;
    }
    
}
