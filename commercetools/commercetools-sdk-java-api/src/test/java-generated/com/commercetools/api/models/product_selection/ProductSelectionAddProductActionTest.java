
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionAddProductActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionAddProductActionBuilder builder) {
        ProductSelectionAddProductAction productSelectionAddProductAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionAddProductAction).isInstanceOf(ProductSelectionAddProductAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ProductSelectionAddProductAction.builder()
                                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { "variantSelection", ProductSelectionAddProductAction.builder()
                        .variantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionAddProductAction value = ProductSelectionAddProductAction.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }

    @Test
    public void variantSelection() {
        ProductSelectionAddProductAction value = ProductSelectionAddProductAction.of();
        value.setVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }
}
