
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ItemShippingTargetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ItemShippingTargetBuilder builder) {
        ItemShippingTarget itemShippingTarget = builder.buildUnchecked();
        Assertions.assertThat(itemShippingTarget).isInstanceOf(ItemShippingTarget.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "addressKey", ItemShippingTarget.builder().addressKey("addressKey") },
                new Object[] { "quantity", ItemShippingTarget.builder().quantity(8L) }, new Object[] {
                        "shippingMethodKey", ItemShippingTarget.builder().shippingMethodKey("shippingMethodKey") } };
    }

    @Test
    public void addressKey() {
        ItemShippingTarget value = ItemShippingTarget.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void quantity() {
        ItemShippingTarget value = ItemShippingTarget.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void shippingMethodKey() {
        ItemShippingTarget value = ItemShippingTarget.of();
        value.setShippingMethodKey("shippingMethodKey");
        Assertions.assertThat(value.getShippingMethodKey()).isEqualTo("shippingMethodKey");
    }
}
