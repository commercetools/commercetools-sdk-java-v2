
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodRemoveStoreActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodRemoveStoreActionBuilder builder) {
        ShippingMethodRemoveStoreAction shippingMethodRemoveStoreAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodRemoveStoreAction).isInstanceOf(ShippingMethodRemoveStoreAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "store", ShippingMethodRemoveStoreAction.builder()
                .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) } };
    }

    @Test
    public void store() {
        ShippingMethodRemoveStoreAction value = ShippingMethodRemoveStoreAction.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
