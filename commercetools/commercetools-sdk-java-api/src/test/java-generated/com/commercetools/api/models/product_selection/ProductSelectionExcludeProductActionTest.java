
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionExcludeProductActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionExcludeProductActionBuilder builder) {
        ProductSelectionExcludeProductAction productSelectionExcludeProductAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionExcludeProductAction)
                .isInstanceOf(ProductSelectionExcludeProductAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ProductSelectionExcludeProductAction.builder()
                                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { "variantExclusion", ProductSelectionExcludeProductAction.builder()
                        .variantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionExcludeProductAction value = ProductSelectionExcludeProductAction.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }

    @Test
    public void variantExclusion() {
        ProductSelectionExcludeProductAction value = ProductSelectionExcludeProductAction.of();
        value.setVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
