
package com.commercetools.api.models.message;

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
public class ProductSelectionProductExcludedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionProductExcludedMessagePayloadBuilder builder) {
        ProductSelectionProductExcludedMessagePayload productSelectionProductExcludedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionProductExcludedMessagePayload)
                .isInstanceOf(ProductSelectionProductExcludedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionProductExcludedMessagePayload.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductSelectionProductExcludedMessagePayload.builder()
                        .variantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionProductExcludedMessagePayload value = ProductSelectionProductExcludedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantExclusion() {
        ProductSelectionProductExcludedMessagePayload value = ProductSelectionProductExcludedMessagePayload.of();
        value.setVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
