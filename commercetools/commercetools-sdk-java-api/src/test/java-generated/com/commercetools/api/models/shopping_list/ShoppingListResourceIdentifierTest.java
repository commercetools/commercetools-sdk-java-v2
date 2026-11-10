
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListResourceIdentifierBuilder builder) {
        ShoppingListResourceIdentifier shoppingListResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(shoppingListResourceIdentifier).isInstanceOf(ShoppingListResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ShoppingListResourceIdentifier.builder().id("id") },
                new Object[] { "key", ShoppingListResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ShoppingListResourceIdentifier value = ShoppingListResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ShoppingListResourceIdentifier value = ShoppingListResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
