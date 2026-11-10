
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountedLineItemPriceForQuantityTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountedLineItemPriceForQuantityBuilder builder) {
        DiscountedLineItemPriceForQuantity discountedLineItemPriceForQuantity = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPriceForQuantity)
                .isInstanceOf(DiscountedLineItemPriceForQuantity.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quantity", DiscountedLineItemPriceForQuantity.builder().quantity(8L) },
                new Object[] { "discountedPrice", DiscountedLineItemPriceForQuantity.builder()
                        .discountedPrice(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl()) } };
    }

    @Test
    public void quantity() {
        DiscountedLineItemPriceForQuantity value = DiscountedLineItemPriceForQuantity.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void discountedPrice() {
        DiscountedLineItemPriceForQuantity value = DiscountedLineItemPriceForQuantity.of();
        value.setDiscountedPrice(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getDiscountedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.DiscountedLineItemPriceImpl());
    }
}
