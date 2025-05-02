
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderStoreSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderStoreSetMessageBuilder builder) {
        OrderStoreSetMessage orderStoreSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderStoreSetMessage).isInstanceOf(OrderStoreSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "store", OrderStoreSetMessage.builder()
                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) } };
    }

    @Test
    public void store() {
        OrderStoreSetMessage value = OrderStoreSetMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }
}
