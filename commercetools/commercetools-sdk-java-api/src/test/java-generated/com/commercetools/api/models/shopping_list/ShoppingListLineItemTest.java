
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
public class ShoppingListLineItemTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListLineItemBuilder builder) {
        ShoppingListLineItem shoppingListLineItem = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItem).isInstanceOf(ShoppingListLineItem.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShoppingListLineItem.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ShoppingListLineItem.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { ShoppingListLineItem.builder().deactivatedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ShoppingListLineItem.builder().id("id") },
                new Object[] { ShoppingListLineItem.builder().key("key") },
                new Object[] { ShoppingListLineItem.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ShoppingListLineItem.builder().productId("productId") },
                new Object[] { ShoppingListLineItem.builder()
                        .productType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl()) },
                new Object[] { ShoppingListLineItem.builder().quantity(8L) },
                new Object[] { ShoppingListLineItem.builder().variantId(5L) },
                new Object[] { ShoppingListLineItem.builder()
                        .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { ShoppingListLineItem.builder()
                        .productSlug(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void addedAt() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void deactivatedAt() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setDeactivatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getDeactivatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void id() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void productId() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void productType() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setProductType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
        Assertions.assertThat(value.getProductType())
                .isEqualTo(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
    }

    @Test
    public void quantity() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void variantId() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void variant() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void productSlug() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setProductSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getProductSlug())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
