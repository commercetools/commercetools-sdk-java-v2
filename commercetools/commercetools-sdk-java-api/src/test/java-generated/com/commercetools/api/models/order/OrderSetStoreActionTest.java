
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetStoreActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetStoreActionBuilder builder) {
        OrderSetStoreAction orderSetStoreAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetStoreAction).isInstanceOf(OrderSetStoreAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "store", OrderSetStoreAction.builder()
                .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) } };
    }

    @Test
    public void store() {
        OrderSetStoreAction value = OrderSetStoreAction.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
