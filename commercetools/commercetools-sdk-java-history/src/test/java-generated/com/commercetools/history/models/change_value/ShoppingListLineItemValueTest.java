
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListLineItemValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListLineItemValueBuilder builder) {
        ShoppingListLineItemValue shoppingListLineItemValue = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItemValue).isInstanceOf(ShoppingListLineItemValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ShoppingListLineItemValue.builder().id("id") },
                new Object[] { "name",
                        ShoppingListLineItemValue.builder()
                                .name(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variantId", ShoppingListLineItemValue.builder().variantId(5) } };
    }

    @Test
    public void id() {
        ShoppingListLineItemValue value = ShoppingListLineItemValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        ShoppingListLineItemValue value = ShoppingListLineItemValue.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variantId() {
        ShoppingListLineItemValue value = ShoppingListLineItemValue.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }
}
