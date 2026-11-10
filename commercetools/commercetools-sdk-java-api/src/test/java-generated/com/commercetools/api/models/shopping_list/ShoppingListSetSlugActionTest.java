
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetSlugActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetSlugActionBuilder builder) {
        ShoppingListSetSlugAction shoppingListSetSlugAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetSlugAction).isInstanceOf(ShoppingListSetSlugAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "slug", ShoppingListSetSlugAction.builder()
                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void slug() {
        ShoppingListSetSlugAction value = ShoppingListSetSlugAction.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
