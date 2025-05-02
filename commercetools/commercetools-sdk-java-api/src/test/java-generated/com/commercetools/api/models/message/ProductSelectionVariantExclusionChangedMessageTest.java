
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionVariantExclusionChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionVariantExclusionChangedMessageBuilder builder) {
        ProductSelectionVariantExclusionChangedMessage productSelectionVariantExclusionChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionVariantExclusionChangedMessage)
                .isInstanceOf(ProductSelectionVariantExclusionChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ProductSelectionVariantExclusionChangedMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "oldVariantExclusion",
                        ProductSelectionVariantExclusionChangedMessage.builder()
                                .oldVariantExclusion(
                                    new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) },
                new Object[] { "newVariantExclusion", ProductSelectionVariantExclusionChangedMessage.builder()
                        .newVariantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionVariantExclusionChangedMessage value = ProductSelectionVariantExclusionChangedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void oldVariantExclusion() {
        ProductSelectionVariantExclusionChangedMessage value = ProductSelectionVariantExclusionChangedMessage.of();
        value.setOldVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getOldVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }

    @Test
    public void newVariantExclusion() {
        ProductSelectionVariantExclusionChangedMessage value = ProductSelectionVariantExclusionChangedMessage.of();
        value.setNewVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getNewVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
