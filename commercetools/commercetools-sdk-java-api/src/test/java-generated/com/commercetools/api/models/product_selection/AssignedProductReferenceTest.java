
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
public class AssignedProductReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssignedProductReferenceBuilder builder) {
        AssignedProductReference assignedProductReference = builder.buildUnchecked();
        Assertions.assertThat(assignedProductReference).isInstanceOf(AssignedProductReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AssignedProductReference.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { AssignedProductReference.builder()
                        .variantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { AssignedProductReference.builder()
                        .variantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        AssignedProductReference value = AssignedProductReference.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantSelection() {
        AssignedProductReference value = AssignedProductReference.of();
        value.setVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }

    @Test
    public void variantExclusion() {
        AssignedProductReference value = AssignedProductReference.of();
        value.setVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
