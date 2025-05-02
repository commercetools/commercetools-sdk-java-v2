
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ItemStateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ItemStateBuilder builder) {
        ItemState itemState = builder.buildUnchecked();
        Assertions.assertThat(itemState).isInstanceOf(ItemState.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quantity", ItemState.builder().quantity(8) }, new Object[] { "state",
                ItemState.builder().state(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void quantity() {
        ItemState value = ItemState.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void state() {
        ItemState value = ItemState.of();
        value.setState(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
