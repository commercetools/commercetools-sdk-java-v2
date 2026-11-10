
package com.commercetools.api.models.shipping_method;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodUpdateBuilder builder) {
        ShippingMethodUpdate shippingMethodUpdate = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodUpdate).isInstanceOf(ShippingMethodUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ShippingMethodUpdate.builder().version(2L) },
                new Object[] { "actions", ShippingMethodUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ShippingMethodUpdate value = ShippingMethodUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ShippingMethodUpdate value = ShippingMethodUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionImpl()));
    }
}
