
package com.commercetools.api.models.shipping_method;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetStoresActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetStoresActionBuilder builder) {
        ShippingMethodSetStoresAction shippingMethodSetStoresAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetStoresAction).isInstanceOf(ShippingMethodSetStoresAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stores",
                ShippingMethodSetStoresAction.builder()
                        .stores(Collections.singletonList(
                            new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void stores() {
        ShippingMethodSetStoresAction value = ShippingMethodSetStoresAction.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
