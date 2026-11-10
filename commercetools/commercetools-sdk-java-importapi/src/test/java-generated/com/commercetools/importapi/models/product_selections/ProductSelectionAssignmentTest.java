
package com.commercetools.importapi.models.product_selections;

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
                                .product(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl()) },
                new Object[] { "variantSelection",
                        ProductSelectionAssignment.builder()
                                .variantSelection(
                                    new com.commercetools.importapi.models.product_selections.VariantSelectionImpl()) },
                new Object[] { "variantExclusion", ProductSelectionAssignment.builder()
                        .variantExclusion(
                            new com.commercetools.importapi.models.product_selections.VariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionAssignment value = ProductSelectionAssignment.of();
        value.setProduct(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
    }

    @Test
    public void variantSelection() {
        ProductSelectionAssignment value = ProductSelectionAssignment.of();
        value.setVariantSelection(new com.commercetools.importapi.models.product_selections.VariantSelectionImpl());
        Assertions.assertThat(value.getVariantSelection())
                .isEqualTo(new com.commercetools.importapi.models.product_selections.VariantSelectionImpl());
    }

    @Test
    public void variantExclusion() {
        ProductSelectionAssignment value = ProductSelectionAssignment.of();
        value.setVariantExclusion(new com.commercetools.importapi.models.product_selections.VariantExclusionImpl());
        Assertions.assertThat(value.getVariantExclusion())
                .isEqualTo(new com.commercetools.importapi.models.product_selections.VariantExclusionImpl());
    }
}
