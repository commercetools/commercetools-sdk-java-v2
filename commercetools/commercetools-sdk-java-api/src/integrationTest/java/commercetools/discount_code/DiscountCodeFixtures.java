
package commercetools.discount_code;

import static commercetools.cart_discount.CartDiscountFixtures.*;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.discount_code.DiscountCodeDraft;
import com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class DiscountCodeFixtures {

    public static void withDiscountCode(final Consumer<DiscountCode> consumer) {
        withCartDiscount(cartDiscount -> {
            DiscountCode discountCode = createDiscountCode(cartDiscount);
            try {
                consumer.accept(discountCode);
            }
            finally {
                deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
            }
        });
    }

    public static void withUpdateableDiscountCode(final UnaryOperator<DiscountCode> operator) {
        withCartDiscount(cartDiscount -> {
            DiscountCode discountCode = createDiscountCode(cartDiscount);
            try {
                discountCode = operator.apply(discountCode);
            }
            finally {
                deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
            }
        });
    }

    public static DiscountCode createDiscountCode(CartDiscount cartDiscount) {
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

        DiscountCode discountCode = CommercetoolsTestUtils.getProjectApiRoot()
                .discountCodes()
                .post(discountCodeDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(discountCode);
        Assertions.assertEquals(discountCodeDraft.getCode(), discountCode.getCode());

        return discountCode;
    }

    public static DiscountCode deleteDiscountCode(final String id, final Long version) {
        DiscountCode discountCode = CommercetoolsTestUtils.getProjectApiRoot()
                .discountCodes()
                .withId(id)
                .delete()
                .withExpand("cartDiscounts[*]")
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(discountCode);
        Assertions.assertEquals(discountCode.getId(), id);

        return discountCode;
    }
}
