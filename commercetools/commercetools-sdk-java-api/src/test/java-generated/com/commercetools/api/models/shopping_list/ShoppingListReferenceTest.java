
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListReferenceBuilder builder) {
        ShoppingListReference shoppingListReference = builder.buildUnchecked();
        Assertions.assertThat(shoppingListReference).isInstanceOf(ShoppingListReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        ShoppingListReference.builder()
                                .obj(new com.commercetools.api.models.shopping_list.ShoppingListImpl()) },
                new Object[] { "id", ShoppingListReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ShoppingListReference value = ShoppingListReference.of();
        value.setObj(new com.commercetools.api.models.shopping_list.ShoppingListImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.shopping_list.ShoppingListImpl());
    }

    @Test
    public void id() {
        ShoppingListReference value = ShoppingListReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
