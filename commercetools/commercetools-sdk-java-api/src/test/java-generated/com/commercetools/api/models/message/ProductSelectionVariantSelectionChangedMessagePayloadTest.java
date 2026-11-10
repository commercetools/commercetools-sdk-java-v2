
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionVariantSelectionChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionVariantSelectionChangedMessagePayloadBuilder builder) {
        ProductSelectionVariantSelectionChangedMessagePayload productSelectionVariantSelectionChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionVariantSelectionChangedMessagePayload)
                .isInstanceOf(ProductSelectionVariantSelectionChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ProductSelectionVariantSelectionChangedMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "oldVariantSelection",
                        ProductSelectionVariantSelectionChangedMessagePayload.builder()
                                .oldVariantSelection(
                                    new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { "newVariantSelection", ProductSelectionVariantSelectionChangedMessagePayload.builder()
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
