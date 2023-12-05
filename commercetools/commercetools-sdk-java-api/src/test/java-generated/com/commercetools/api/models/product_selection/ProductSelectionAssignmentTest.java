
package com.commercetools.api.models.product_selection;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ProductSelectionAssignmentTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionAssignmentBuilder builder) {
        ProductSelectionAssignment productSelectionAssignment = builder.buildUnchecked();
        Assertions.assertThat(productSelectionAssignment).isInstanceOf(ProductSelectionAssignment.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionAssignment.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductSelectionAssignment.builder()
                        .productSelection(
                            new com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl()) },
                new Object[] { ProductSelectionAssignment.builder()
                        .variantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { ProductSelectionAssignment.builder()
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
