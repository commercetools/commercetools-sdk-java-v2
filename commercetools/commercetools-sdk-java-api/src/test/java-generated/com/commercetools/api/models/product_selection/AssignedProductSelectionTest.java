
package com.commercetools.api.models.product_selection;

import java.time.ZonedDateTime;

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
public class AssignedProductSelectionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssignedProductSelectionBuilder builder) {
        AssignedProductSelection assignedProductSelection = builder.buildUnchecked();
        Assertions.assertThat(assignedProductSelection).isInstanceOf(AssignedProductSelection.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssignedProductSelection.builder()
                .productSelection(new com.commercetools.api.models.product_selection.ProductSelectionReferenceImpl()) },
                new Object[] { AssignedProductSelection.builder()
                        .variantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { AssignedProductSelection.builder()
                        .variantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) },
                new Object[] {
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
