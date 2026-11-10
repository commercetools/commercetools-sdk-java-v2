
package com.commercetools.api.models.shopping_list;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListLineItemDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListLineItemDraftBuilder builder) {
        ShoppingListLineItemDraft shoppingListLineItemDraft = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItemDraft).isInstanceOf(ShoppingListLineItemDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ShoppingListLineItemDraft.builder().key("key") },
                new Object[] { "productId", ShoppingListLineItemDraft.builder().productId("productId") },
                new Object[] { "variantId", ShoppingListLineItemDraft.builder().variantId(5L) },
                new Object[] { "sku", ShoppingListLineItemDraft.builder().sku("sku") },
                new Object[] { "addedAt",
                        ShoppingListLineItemDraft.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom",
                        ShoppingListLineItemDraft.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "quantity", ShoppingListLineItemDraft.builder().quantity(8L) } };
    }

    @Test
    public void key() {
        ShoppingListLineItemDraft value = ShoppingListLineItemDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void productId() {
        ShoppingListLineItemDraft value = ShoppingListLineItemDraft.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        ShoppingListLineItemDraft value = ShoppingListLineItemDraft.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ShoppingListLineItemDraft value = ShoppingListLineItemDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void addedAt() {
        ShoppingListLineItemDraft value = ShoppingListLineItemDraft.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        ShoppingListLineItemDraft value = ShoppingListLineItemDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void quantity() {
        ShoppingListLineItemDraft value = ShoppingListLineItemDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
