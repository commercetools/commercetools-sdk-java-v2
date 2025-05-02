
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetAnonymousIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetAnonymousIdActionBuilder builder) {
        ShoppingListSetAnonymousIdAction shoppingListSetAnonymousIdAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetAnonymousIdAction).isInstanceOf(ShoppingListSetAnonymousIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "anonymousId", ShoppingListSetAnonymousIdAction.builder().anonymousId("anonymousId") } };
    }

    @Test
    public void anonymousId() {
        ShoppingListSetAnonymousIdAction value = ShoppingListSetAnonymousIdAction.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }
}
