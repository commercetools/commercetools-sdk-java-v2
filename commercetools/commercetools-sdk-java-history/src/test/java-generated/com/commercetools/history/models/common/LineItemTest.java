
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemBuilder builder) {
        LineItem lineItem = builder.buildUnchecked();
        Assertions.assertThat(lineItem).isInstanceOf(LineItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "addedAt", LineItem.builder().addedAt("addedAt") },
                new Object[] { "custom",
                        LineItem.builder().custom(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "id", LineItem.builder().id("id") },
                new Object[] { "name",
                        LineItem.builder().name(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "productId", LineItem.builder().productId("productId") },
                new Object[] { "productSlug",
                        LineItem.builder()
                                .productSlug(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "productType",
                        LineItem.builder().productType(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "quantity", LineItem.builder().quantity(8) },
                new Object[] { "variant",
                        LineItem.builder().variant(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { "variantId", LineItem.builder().variantId(5) } };
    }

    @Test
    public void addedAt() {
        LineItem value = LineItem.of();
        value.setAddedAt("addedAt");
        Assertions.assertThat(value.getAddedAt()).isEqualTo("addedAt");
    }

    @Test
    public void custom() {
        LineItem value = LineItem.of();
        value.setCustom(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void id() {
        LineItem value = LineItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        LineItem value = LineItem.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void productId() {
        LineItem value = LineItem.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void productSlug() {
        LineItem value = LineItem.of();
        value.setProductSlug(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getProductSlug())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void productType() {
        LineItem value = LineItem.of();
        value.setProductType(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getProductType())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void quantity() {
        LineItem value = LineItem.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void variant() {
        LineItem value = LineItem.of();
        value.setVariant(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getVariant()).isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void variantId() {
        LineItem value = LineItem.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }
}
