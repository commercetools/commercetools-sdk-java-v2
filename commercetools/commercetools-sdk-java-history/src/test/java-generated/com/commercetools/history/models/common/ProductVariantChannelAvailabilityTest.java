
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
                new Object[] { "restockableInDays", ProductVariantChannelAvailability.builder().restockableInDays(4L) },
                new Object[] { "availableQuantity", ProductVariantChannelAvailability.builder().availableQuantity(3L) },
                new Object[] { "id", ProductVariantChannelAvailability.builder().id("id") },
                new Object[] { "version", ProductVariantChannelAvailability.builder().version(2L) } };
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
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }

    @Test
    public void availableQuantity() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setAvailableQuantity(3L);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3L);
    }

    @Test
    public void id() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
