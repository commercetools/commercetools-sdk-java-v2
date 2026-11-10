
package com.commercetools.api.models.product;

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
        return new Object[][] { new Object[] { "channels", ProductVariantAvailability.builder()
                .channels(new com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapImpl()) },
                new Object[] { "isOnStock", ProductVariantAvailability.builder().isOnStock(true) },
                new Object[] { "restockableInDays", ProductVariantAvailability.builder().restockableInDays(4L) },
                new Object[] { "availableQuantity", ProductVariantAvailability.builder().availableQuantity(3L) },
                new Object[] { "id", ProductVariantAvailability.builder().id("id") },
                new Object[] { "version", ProductVariantAvailability.builder().version(2L) } };
    }

    @Test
    public void channels() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setChannels(new com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapImpl());
        Assertions.assertThat(value.getChannels())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapImpl());
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
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }

    @Test
    public void availableQuantity() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setAvailableQuantity(3L);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3L);
    }

    @Test
    public void id() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
