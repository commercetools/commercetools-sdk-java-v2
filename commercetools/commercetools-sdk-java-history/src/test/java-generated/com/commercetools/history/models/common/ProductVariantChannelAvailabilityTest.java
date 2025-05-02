
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantChannelAvailabilityTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantChannelAvailabilityBuilder builder) {
        ProductVariantChannelAvailability productVariantChannelAvailability = builder.buildUnchecked();
        Assertions.assertThat(productVariantChannelAvailability).isInstanceOf(ProductVariantChannelAvailability.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "isOnStock", ProductVariantChannelAvailability.builder().isOnStock(true) },
                new Object[] { "restockableInDays", ProductVariantChannelAvailability.builder().restockableInDays(4) },
                new Object[] { "availableQuantity",
                        ProductVariantChannelAvailability.builder().availableQuantity(3) } };
    }

    @Test
    public void isOnStock() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setIsOnStock(true);
        Assertions.assertThat(value.getIsOnStock()).isEqualTo(true);
    }

    @Test
    public void restockableInDays() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setRestockableInDays(4);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4);
    }

    @Test
    public void availableQuantity() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setAvailableQuantity(3);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3);
    }
}
