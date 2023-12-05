
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
public class ProductSelectionSetVariantExclusionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionSetVariantExclusionActionBuilder builder) {
        ProductSelectionSetVariantExclusionAction productSelectionSetVariantExclusionAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetVariantExclusionAction)
                .isInstanceOf(ProductSelectionSetVariantExclusionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionSetVariantExclusionAction.builder()
                        .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { ProductSelectionSetVariantExclusionAction.builder()
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
