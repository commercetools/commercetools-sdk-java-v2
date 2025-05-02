
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ItemShippingDetailsDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ItemShippingDetailsDraftBuilder builder) {
        ItemShippingDetailsDraft itemShippingDetailsDraft = builder.buildUnchecked();
        Assertions.assertThat(itemShippingDetailsDraft).isInstanceOf(ItemShippingDetailsDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "targets", ItemShippingDetailsDraft.builder()
                .targets(Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl())) } };
    }

    @Test
    public void targets() {
        ItemShippingDetailsDraft value = ItemShippingDetailsDraft.of();
        value.setTargets(Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
        Assertions.assertThat(value.getTargets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
    }
}
