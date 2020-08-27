package commercetools.discount_code;

import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.discount_code.DiscountCodeDraft;
import com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder;
import commercetools.cart_discount.CartDiscountFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DiscountCodeFixtures {

    public static void withDiscountCode(final Consumer<DiscountCode> consumer) {
        DiscountCode discountCode = createDiscountCode();
        consumer.accept(discountCode);
        deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
    }

    public static void withUpdateableDiscountCode(final UnaryOperator<DiscountCode> operator) {
        DiscountCode discountCode = createDiscountCode();
        discountCode = operator.apply(discountCode);
        deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
    }

    public static DiscountCode createDiscountCode() {
        CartDiscount cartDiscount = CartDiscountFixtures.createCartDiscount();
        CartDiscountResourceIdentifier cartDiscountReference = CartDiscountResourceIdentifierBuilder.of()
                .id(cartDiscount.getId())
                .build();

        DiscountCodeDraft discountCodeDraft = DiscountCodeDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .description(CommercetoolsTestUtils.randomLocalizedString())
                .code(CommercetoolsTestUtils.randomString())
                .cartDiscounts(Arrays.asList(cartDiscountReference))
                .cartPredicate("country=\"DE\"")
                .groups(Arrays.asList("group-one"))
                .isActive(false)
                .validFrom(ZonedDateTime.now().plus(1, ChronoUnit.HOURS))
                .validUntil(ZonedDateTime.now().plus(3, ChronoUnit.HOURS))
                .maxApplications(2L)
                .maxApplicationsPerCustomer(1L)
                .build();

        DiscountCode discountCode = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .discountCodes()
                .post(discountCodeDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(discountCode);
        Assert.assertEquals(discountCodeDraft.getCode(), discountCode.getCode());

        return discountCode;
    }

    public static DiscountCode deleteDiscountCode(final String id, final Long version) {
        DiscountCode discountCode = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .discountCodes()
                .withId(id)
                .delete()
                .withExpand("cartDiscounts[*]")
                .withVersion(version)
                .executeBlocking().getBody();

        discountCode.getCartDiscounts().forEach(cartDiscountReference -> {
            CartDiscountFixtures.deleteCartDiscount(cartDiscountReference.getId(), cartDiscountReference.getObj().getVersion());
        });

        Assert.assertNotNull(discountCode);
        Assert.assertEquals(discountCode.getId(), id);

        return discountCode;
    }
}
