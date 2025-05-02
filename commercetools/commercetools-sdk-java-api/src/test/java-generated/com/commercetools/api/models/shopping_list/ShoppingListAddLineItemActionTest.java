
package com.commercetools.api.models.shopping_list;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListAddLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListAddLineItemActionBuilder builder) {
        ShoppingListAddLineItemAction shoppingListAddLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListAddLineItemAction).isInstanceOf(ShoppingListAddLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ShoppingListAddLineItemAction.builder().key("key") },
                new Object[] { "sku", ShoppingListAddLineItemAction.builder().sku("sku") },
                new Object[] { "productId", ShoppingListAddLineItemAction.builder().productId("productId") },
                new Object[] { "variantId", ShoppingListAddLineItemAction.builder().variantId(5L) },
                new Object[] { "quantity", ShoppingListAddLineItemAction.builder().quantity(8L) },
                new Object[] { "addedAt",
                        ShoppingListAddLineItemAction.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom", ShoppingListAddLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        ShoppingListAddLineItemAction value = ShoppingListAddLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        ShoppingListAddLineItemAction value = ShoppingListAddLineItemAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void productId() {
        ShoppingListAddLineItemAction value = ShoppingListAddLineItemAction.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        ShoppingListAddLineItemAction value = ShoppingListAddLineItemAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void quantity() {
        ShoppingListAddLineItemAction value = ShoppingListAddLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        ShoppingListAddLineItemAction value = ShoppingListAddLineItemAction.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        ShoppingListAddLineItemAction value = ShoppingListAddLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
