
package com.commercetools.api.models.shopping_list;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListUpdateBuilder builder) {
        ShoppingListUpdate shoppingListUpdate = builder.buildUnchecked();
        Assertions.assertThat(shoppingListUpdate).isInstanceOf(ShoppingListUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ShoppingListUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ShoppingListUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.shopping_list.ShoppingListUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ShoppingListUpdate value = ShoppingListUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ShoppingListUpdate value = ShoppingListUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.shopping_list.ShoppingListUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.shopping_list.ShoppingListUpdateActionImpl()));
    }
}
