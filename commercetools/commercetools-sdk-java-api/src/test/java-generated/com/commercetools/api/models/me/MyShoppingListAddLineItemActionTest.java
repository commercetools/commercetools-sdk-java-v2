
package com.commercetools.api.models.me;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListAddLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListAddLineItemActionBuilder builder) {
        MyShoppingListAddLineItemAction myShoppingListAddLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListAddLineItemAction).isInstanceOf(MyShoppingListAddLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", MyShoppingListAddLineItemAction.builder().key("key") },
                new Object[] { "sku", MyShoppingListAddLineItemAction.builder().sku("sku") },
                new Object[] { "productId", MyShoppingListAddLineItemAction.builder().productId("productId") },
                new Object[] { "variantId", MyShoppingListAddLineItemAction.builder().variantId(5L) },
                new Object[] { "quantity", MyShoppingListAddLineItemAction.builder().quantity(8L) },
                new Object[] { "addedAt",
                        MyShoppingListAddLineItemAction.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom", MyShoppingListAddLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void productId() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void quantity() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        MyShoppingListAddLineItemAction value = MyShoppingListAddLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
