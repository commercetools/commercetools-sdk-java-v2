
package com.commercetools.api.models.order;

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
        return new Object[][] { new Object[] { "quantity", ItemState.builder().quantity(8L) }, new Object[] { "state",
                ItemState.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void quantity() {
        ItemState value = ItemState.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void state() {
        ItemState value = ItemState.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
