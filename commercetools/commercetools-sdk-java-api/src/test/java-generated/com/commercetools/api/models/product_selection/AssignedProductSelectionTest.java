
package com.commercetools.api.models.product_selection;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssignedProductSelectionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssignedProductSelectionBuilder builder) {
        AssignedProductSelection assignedProductSelection = builder.buildUnchecked();
        Assertions.assertThat(assignedProductSelection).isInstanceOf(AssignedProductSelection.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productSelection", AssignedProductSelection.builder()
                .productSelection(new com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl()) },
                new Object[] { "variantSelection",
                        AssignedProductSelection.builder()
                                .variantSelection(
                                    new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { "variantExclusion",
                        AssignedProductSelection.builder()
                                .variantExclusion(
                                    new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) },
                new Object[] { "createdAt",
                        AssignedProductSelection.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void productSelection() {
        AssignedProductSelection value = AssignedProductSelection.of();
        value.setProductSelection(new com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl());
    }

    @Test
    public void variantSelection() {
        AssignedProductSelection value = AssignedProductSelection.of();
        value.setVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }

    @Test
    public void variantExclusion() {
        AssignedProductSelection value = AssignedProductSelection.of();
        value.setVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }

    @Test
    public void createdAt() {
        AssignedProductSelection value = AssignedProductSelection.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
