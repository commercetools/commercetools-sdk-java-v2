
package com.commercetools.api.models.shopping_list;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListLineItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListLineItemBuilder builder) {
        ShoppingListLineItem shoppingListLineItem = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItem).isInstanceOf(ShoppingListLineItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedAt",
                        ShoppingListLineItem.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom",
                        ShoppingListLineItem.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "deactivatedAt",
                        ShoppingListLineItem.builder().deactivatedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "id", ShoppingListLineItem.builder().id("id") },
                new Object[] { "key", ShoppingListLineItem.builder().key("key") },
                new Object[] { "name",
                        ShoppingListLineItem.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "productId", ShoppingListLineItem.builder().productId("productId") },
                new Object[] { "productType", ShoppingListLineItem.builder()
                        .productType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl()) },
                new Object[] { "published", ShoppingListLineItem.builder().published(true) },
                new Object[] { "quantity", ShoppingListLineItem.builder().quantity(8L) },
                new Object[] { "variantId", ShoppingListLineItem.builder().variantId(5L) },
                new Object[] { "variant",
                        ShoppingListLineItem.builder()
                                .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { "productSlug", ShoppingListLineItem.builder()
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
    public void published() {
        ShoppingListLineItem value = ShoppingListLineItem.of();
        value.setPublished(true);
        Assertions.assertThat(value.getPublished()).isEqualTo(true);
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
