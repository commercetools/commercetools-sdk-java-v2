
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPresentWithDifferentVariantSelectionErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPresentWithDifferentVariantSelectionErrorBuilder builder) {
        ProductPresentWithDifferentVariantSelectionError productPresentWithDifferentVariantSelectionError = builder
                .buildUnchecked();
        Assertions.assertThat(productPresentWithDifferentVariantSelectionError)
                .isInstanceOf(ProductPresentWithDifferentVariantSelectionError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message",
                        ProductPresentWithDifferentVariantSelectionError.builder().message("message") },
                new Object[] { "product",
                        ProductPresentWithDifferentVariantSelectionError.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "existingVariantSelection", ProductPresentWithDifferentVariantSelectionError.builder()
                        .existingVariantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void message() {
        ProductPresentWithDifferentVariantSelectionError value = ProductPresentWithDifferentVariantSelectionError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void product() {
        ProductPresentWithDifferentVariantSelectionError value = ProductPresentWithDifferentVariantSelectionError.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void existingVariantSelection() {
        ProductPresentWithDifferentVariantSelectionError value = ProductPresentWithDifferentVariantSelectionError.of();
        value.setExistingVariantSelection(
            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getExistingVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }
}
