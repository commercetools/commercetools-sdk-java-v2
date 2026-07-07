
package com.commercetools.api.models.variant_attributes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantAttributesAvailabilityTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantAttributesAvailabilityBuilder builder) {
        VariantAttributesAvailability variantAttributesAvailability = builder.buildUnchecked();
        Assertions.assertThat(variantAttributesAvailability).isInstanceOf(VariantAttributesAvailability.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "isOnStock", VariantAttributesAvailability.builder().isOnStock(true) },
                new Object[] { "availableQuantity", VariantAttributesAvailability.builder().availableQuantity(3L) },
                new Object[] { "channels", VariantAttributesAvailability.builder()
                        .channels(
                            new com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMapImpl()) } };
    }

    @Test
    public void isOnStock() {
        VariantAttributesAvailability value = VariantAttributesAvailability.of();
        value.setIsOnStock(true);
        Assertions.assertThat(value.getIsOnStock()).isEqualTo(true);
    }

    @Test
    public void availableQuantity() {
        VariantAttributesAvailability value = VariantAttributesAvailability.of();
        value.setAvailableQuantity(3L);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3L);
    }

    @Test
    public void channels() {
        VariantAttributesAvailability value = VariantAttributesAvailability.of();
        value.setChannels(
            new com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMapImpl());
        Assertions.assertThat(value.getChannels())
                .isEqualTo(
                    new com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMapImpl());
    }
}
