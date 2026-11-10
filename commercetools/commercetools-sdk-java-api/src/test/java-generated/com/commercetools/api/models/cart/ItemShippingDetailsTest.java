
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ItemShippingDetailsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ItemShippingDetailsBuilder builder) {
        ItemShippingDetails itemShippingDetails = builder.buildUnchecked();
        Assertions.assertThat(itemShippingDetails).isInstanceOf(ItemShippingDetails.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "targets",
                        ItemShippingDetails.builder()
                                .targets(Collections.singletonList(
                                    new com.commercetools.api.models.cart.ItemShippingTargetImpl())) },
                new Object[] { "valid", ItemShippingDetails.builder().valid(true) } };
    }

    @Test
    public void targets() {
        ItemShippingDetails value = ItemShippingDetails.of();
        value.setTargets(Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
        Assertions.assertThat(value.getTargets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
    }

    @Test
    public void valid() {
        ItemShippingDetails value = ItemShippingDetails.of();
        value.setValid(true);
        Assertions.assertThat(value.getValid()).isEqualTo(true);
    }
}
