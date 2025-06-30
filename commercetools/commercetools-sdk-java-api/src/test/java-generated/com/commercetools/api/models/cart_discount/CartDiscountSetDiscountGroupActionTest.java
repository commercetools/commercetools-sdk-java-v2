
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountSetDiscountGroupActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountSetDiscountGroupActionBuilder builder) {
        CartDiscountSetDiscountGroupAction cartDiscountSetDiscountGroupAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetDiscountGroupAction)
                .isInstanceOf(CartDiscountSetDiscountGroupAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountGroup", CartDiscountSetDiscountGroupAction.builder()
                .discountGroup(new com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierImpl()) },
                new Object[] { "sortOrder", CartDiscountSetDiscountGroupAction.builder().sortOrder("sortOrder") } };
    }

    @Test
    public void discountGroup() {
        CartDiscountSetDiscountGroupAction value = CartDiscountSetDiscountGroupAction.of();
        value.setDiscountGroup(new com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getDiscountGroup())
                .isEqualTo(new com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierImpl());
    }

    @Test
    public void sortOrder() {
        CartDiscountSetDiscountGroupAction value = CartDiscountSetDiscountGroupAction.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }
}
