
package com.commercetools.api.models.message;

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
public class ProductSelectionVariantSelectionChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionVariantSelectionChangedMessagePayloadBuilder builder) {
        ProductSelectionVariantSelectionChangedMessagePayload productSelectionVariantSelectionChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionVariantSelectionChangedMessagePayload)
                .isInstanceOf(ProductSelectionVariantSelectionChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionVariantSelectionChangedMessagePayload.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductSelectionVariantSelectionChangedMessagePayload.builder()
                        .oldVariantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { ProductSelectionVariantSelectionChangedMessagePayload.builder()
                        .newVariantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionVariantSelectionChangedMessagePayload value = ProductSelectionVariantSelectionChangedMessagePayload
                .of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void oldVariantSelection() {
        ProductSelectionVariantSelectionChangedMessagePayload value = ProductSelectionVariantSelectionChangedMessagePayload
                .of();
        value.setOldVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getOldVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }

    @Test
    public void newVariantSelection() {
        ProductSelectionVariantSelectionChangedMessagePayload value = ProductSelectionVariantSelectionChangedMessagePayload
                .of();
        value.setNewVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getNewVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }
}
