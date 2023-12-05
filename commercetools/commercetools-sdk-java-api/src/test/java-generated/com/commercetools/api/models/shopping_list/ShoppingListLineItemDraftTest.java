
package com.commercetools.api.models.shopping_list;

import java.time.ZonedDateTime;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ShoppingListLineItemDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListLineItemDraftBuilder builder) {
        ShoppingListLineItemDraft shoppingListLineItemDraft = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItemDraft).isInstanceOf(ShoppingListLineItemDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListLineItemDraft.builder().key("key") },
                new Object[] { ShoppingListLineItemDraft.builder().productId("productId") },
                new Object[] { ShoppingListLineItemDraft.builder().variantId(5L) },
                new Object[] { ShoppingListLineItemDraft.builder().sku("sku") },
                new Object[] { ShoppingListLineItemDraft.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ShoppingListLineItemDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { ShoppingListLineItemDraft.builder().quantity(8L) } };
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
