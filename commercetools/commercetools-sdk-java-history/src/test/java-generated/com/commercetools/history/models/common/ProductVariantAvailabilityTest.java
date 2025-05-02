
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantAvailabilityTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantAvailabilityBuilder builder) {
        ProductVariantAvailability productVariantAvailability = builder.buildUnchecked();
        Assertions.assertThat(productVariantAvailability).isInstanceOf(ProductVariantAvailability.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "isOnStock", ProductVariantAvailability.builder().isOnStock(true) },
                new Object[] { "restockableInDays", ProductVariantAvailability.builder().restockableInDays(4) },
                new Object[] { "availableQuantity", ProductVariantAvailability.builder().availableQuantity(3) },
                new Object[] { "channels", ProductVariantAvailability.builder()
                        .channels(
                            new com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapImpl()) } };
    }

    @Test
    public void isOnStock() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setIsOnStock(true);
        Assertions.assertThat(value.getIsOnStock()).isEqualTo(true);
    }

    @Test
    public void restockableInDays() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setRestockableInDays(4);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4);
    }

    @Test
    public void availableQuantity() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setAvailableQuantity(3);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3);
    }

    @Test
    public void channels() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setChannels(new com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapImpl());
        Assertions.assertThat(value.getChannels())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapImpl());
    }
}
