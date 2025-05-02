
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionSetVariantExclusionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionSetVariantExclusionActionBuilder builder) {
        ProductSelectionSetVariantExclusionAction productSelectionSetVariantExclusionAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetVariantExclusionAction)
                .isInstanceOf(ProductSelectionSetVariantExclusionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ProductSelectionSetVariantExclusionAction.builder()
                                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { "variantExclusion", ProductSelectionSetVariantExclusionAction.builder()
                        .variantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionSetVariantExclusionAction value = ProductSelectionSetVariantExclusionAction.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }

    @Test
    public void variantExclusion() {
        ProductSelectionSetVariantExclusionAction value = ProductSelectionSetVariantExclusionAction.of();
        value.setVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
