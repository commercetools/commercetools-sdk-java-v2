
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionAssignmentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionAssignmentBuilder builder) {
        ProductSelectionAssignment productSelectionAssignment = builder.buildUnchecked();
        Assertions.assertThat(productSelectionAssignment).isInstanceOf(ProductSelectionAssignment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        ProductSelectionAssignment.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "productSelection", ProductSelectionAssignment.builder()
                        .productSelection(
                            new com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl()) },
                new Object[] { "variantSelection",
                        ProductSelectionAssignment.builder()
                                .variantSelection(
                                    new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { "variantExclusion", ProductSelectionAssignment.builder()
                        .variantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionAssignment value = ProductSelectionAssignment.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void productSelection() {
        ProductSelectionAssignment value = ProductSelectionAssignment.of();
        value.setProductSelection(new com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl());
    }

    @Test
    public void variantSelection() {
        ProductSelectionAssignment value = ProductSelectionAssignment.of();
        value.setVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }

    @Test
    public void variantExclusion() {
        ProductSelectionAssignment value = ProductSelectionAssignment.of();
        value.setVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
