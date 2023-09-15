
package com.commercetools.history.models.common;

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
public class LineItemTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LineItemBuilder builder) {
        LineItem lineItem = builder.buildUnchecked();
        Assertions.assertThat(lineItem).isInstanceOf(LineItem.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LineItem.builder().addedAt("addedAt") },
                new Object[] {
                        LineItem.builder().custom(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { LineItem.builder().id("id") },
                new Object[] {
                        LineItem.builder().name(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { LineItem.builder().productId("productId") },
                new Object[] { LineItem.builder()
                        .productSlug(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] {
                        LineItem.builder().productType(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { LineItem.builder().quantity(8) },
                new Object[] { LineItem.builder().variant(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { LineItem.builder().variantId(5) } };
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
