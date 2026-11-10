
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionVariantSelectionChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionVariantSelectionChangedMessageBuilder builder) {
        ProductSelectionVariantSelectionChangedMessage productSelectionVariantSelectionChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionVariantSelectionChangedMessage)
                .isInstanceOf(ProductSelectionVariantSelectionChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ProductSelectionVariantSelectionChangedMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "oldVariantSelection",
                        ProductSelectionVariantSelectionChangedMessage.builder()
                                .oldVariantSelection(
                                    new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { "newVariantSelection", ProductSelectionVariantSelectionChangedMessage.builder()
                        .newVariantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionVariantSelectionChangedMessage value = ProductSelectionVariantSelectionChangedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void oldVariantSelection() {
        ProductSelectionVariantSelectionChangedMessage value = ProductSelectionVariantSelectionChangedMessage.of();
        value.setOldVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getOldVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }

    @Test
    public void newVariantSelection() {
        ProductSelectionVariantSelectionChangedMessage value = ProductSelectionVariantSelectionChangedMessage.of();
        value.setNewVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getNewVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }
}
