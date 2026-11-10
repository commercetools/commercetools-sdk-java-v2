
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionVariantExclusionChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionVariantExclusionChangedMessagePayloadBuilder builder) {
        ProductSelectionVariantExclusionChangedMessagePayload productSelectionVariantExclusionChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionVariantExclusionChangedMessagePayload)
                .isInstanceOf(ProductSelectionVariantExclusionChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ProductSelectionVariantExclusionChangedMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "oldVariantExclusion",
                        ProductSelectionVariantExclusionChangedMessagePayload.builder()
                                .oldVariantExclusion(
                                    new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) },
                new Object[] { "newVariantExclusion", ProductSelectionVariantExclusionChangedMessagePayload.builder()
                        .newVariantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionVariantExclusionChangedMessagePayload value = ProductSelectionVariantExclusionChangedMessagePayload
                .of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void oldVariantExclusion() {
        ProductSelectionVariantExclusionChangedMessagePayload value = ProductSelectionVariantExclusionChangedMessagePayload
                .of();
        value.setOldVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getOldVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }

    @Test
    public void newVariantExclusion() {
        ProductSelectionVariantExclusionChangedMessagePayload value = ProductSelectionVariantExclusionChangedMessagePayload
                .of();
        value.setNewVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getNewVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
