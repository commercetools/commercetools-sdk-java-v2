
package com.commercetools.api.models.shopping_list;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListAddTextLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListAddTextLineItemActionBuilder builder) {
        ShoppingListAddTextLineItemAction shoppingListAddTextLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListAddTextLineItemAction).isInstanceOf(ShoppingListAddTextLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        ShoppingListAddTextLineItemAction.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", ShoppingListAddTextLineItemAction.builder().key("key") },
                new Object[] { "description",
                        ShoppingListAddTextLineItemAction.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "quantity", ShoppingListAddTextLineItemAction.builder().quantity(8L) },
                new Object[] { "addedAt",
                        ShoppingListAddTextLineItemAction.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom", ShoppingListAddTextLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void name() {
        ShoppingListAddTextLineItemAction value = ShoppingListAddTextLineItemAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        ShoppingListAddTextLineItemAction value = ShoppingListAddTextLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        ShoppingListAddTextLineItemAction value = ShoppingListAddTextLineItemAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void quantity() {
        ShoppingListAddTextLineItemAction value = ShoppingListAddTextLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        ShoppingListAddTextLineItemAction value = ShoppingListAddTextLineItemAction.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        ShoppingListAddTextLineItemAction value = ShoppingListAddTextLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
