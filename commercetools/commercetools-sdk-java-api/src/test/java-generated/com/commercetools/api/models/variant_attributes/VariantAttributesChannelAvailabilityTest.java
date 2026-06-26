
package com.commercetools.api.models.variant_attributes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantAttributesChannelAvailabilityTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantAttributesChannelAvailabilityBuilder builder) {
        VariantAttributesChannelAvailability variantAttributesChannelAvailability = builder.buildUnchecked();
        Assertions.assertThat(variantAttributesChannelAvailability)
                .isInstanceOf(VariantAttributesChannelAvailability.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "isOnStock", VariantAttributesChannelAvailability.builder().isOnStock(true) },
                new Object[] { "availableQuantity",
                        VariantAttributesChannelAvailability.builder().availableQuantity(3L) } };
    }

    @Test
    public void isOnStock() {
        VariantAttributesChannelAvailability value = VariantAttributesChannelAvailability.of();
        value.setIsOnStock(true);
        Assertions.assertThat(value.getIsOnStock()).isEqualTo(true);
    }

    @Test
    public void availableQuantity() {
        VariantAttributesChannelAvailability value = VariantAttributesChannelAvailability.of();
        value.setAvailableQuantity(3L);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3L);
    }
}
