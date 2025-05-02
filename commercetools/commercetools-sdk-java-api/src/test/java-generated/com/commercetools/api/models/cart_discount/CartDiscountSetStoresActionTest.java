
package com.commercetools.api.models.cart_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountSetStoresActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountSetStoresActionBuilder builder) {
        CartDiscountSetStoresAction cartDiscountSetStoresAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetStoresAction).isInstanceOf(CartDiscountSetStoresAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stores",
                CartDiscountSetStoresAction.builder()
                        .stores(Collections.singletonList(
                            new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void stores() {
        CartDiscountSetStoresAction value = CartDiscountSetStoresAction.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
