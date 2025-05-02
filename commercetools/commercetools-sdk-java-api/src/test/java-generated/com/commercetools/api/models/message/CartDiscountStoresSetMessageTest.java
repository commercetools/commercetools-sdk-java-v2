
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountStoresSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountStoresSetMessageBuilder builder) {
        CartDiscountStoresSetMessage cartDiscountStoresSetMessage = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountStoresSetMessage).isInstanceOf(CartDiscountStoresSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stores", CartDiscountStoresSetMessage.builder()
                .stores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl())) } };
    }

    @Test
    public void stores() {
        CartDiscountStoresSetMessage value = CartDiscountStoresSetMessage.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }
}
