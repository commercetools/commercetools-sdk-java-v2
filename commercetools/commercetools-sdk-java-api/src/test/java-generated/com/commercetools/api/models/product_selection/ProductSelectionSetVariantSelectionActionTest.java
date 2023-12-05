
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
public class ProductSelectionSetVariantSelectionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionSetVariantSelectionActionBuilder builder) {
        ProductSelectionSetVariantSelectionAction productSelectionSetVariantSelectionAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetVariantSelectionAction)
                .isInstanceOf(ProductSelectionSetVariantSelectionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionSetVariantSelectionAction.builder()
                        .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { ProductSelectionSetVariantSelectionAction.builder()
                        .variantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionSetVariantSelectionAction value = ProductSelectionSetVariantSelectionAction.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }

    @Test
    public void variantSelection() {
        ProductSelectionSetVariantSelectionAction value = ProductSelectionSetVariantSelectionAction.of();
        value.setVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }
}
