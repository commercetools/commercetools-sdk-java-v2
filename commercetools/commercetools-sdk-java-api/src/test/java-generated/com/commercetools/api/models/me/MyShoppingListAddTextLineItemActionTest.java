
package com.commercetools.api.models.me;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListAddTextLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListAddTextLineItemActionBuilder builder) {
        MyShoppingListAddTextLineItemAction myShoppingListAddTextLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListAddTextLineItemAction)
                .isInstanceOf(MyShoppingListAddTextLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        MyShoppingListAddTextLineItemAction.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", MyShoppingListAddTextLineItemAction.builder().key("key") },
                new Object[] { "description",
                        MyShoppingListAddTextLineItemAction.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "quantity", MyShoppingListAddTextLineItemAction.builder().quantity(8L) },
                new Object[] { "addedAt",
                        MyShoppingListAddTextLineItemAction.builder()
                                .addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom", MyShoppingListAddTextLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void name() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void quantity() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        MyShoppingListAddTextLineItemAction value = MyShoppingListAddTextLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
