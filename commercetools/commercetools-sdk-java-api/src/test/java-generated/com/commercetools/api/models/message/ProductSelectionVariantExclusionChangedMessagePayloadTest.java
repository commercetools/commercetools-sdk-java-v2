
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
public class ProductSelectionVariantExclusionChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionVariantExclusionChangedMessagePayloadBuilder builder) {
        ProductSelectionVariantExclusionChangedMessagePayload productSelectionVariantExclusionChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionVariantExclusionChangedMessagePayload)
                .isInstanceOf(ProductSelectionVariantExclusionChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionVariantExclusionChangedMessagePayload.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductSelectionVariantExclusionChangedMessagePayload.builder()
                        .oldVariantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) },
                new Object[] { ProductSelectionVariantExclusionChangedMessagePayload.builder()
                        .newVariantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionVariantExclusionChangedMessagePayload value = ProductSelectionVariantExclusionChangedMessagePayload
                .of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void oldVariantExclusion() {
        ProductSelectionVariantExclusionChangedMessagePayload value = ProductSelectionVariantExclusionChangedMessagePayload
                .of();
        value.setOldVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getOldVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }

    @Test
    public void newVariantExclusion() {
        ProductSelectionVariantExclusionChangedMessagePayload value = ProductSelectionVariantExclusionChangedMessagePayload
                .of();
        value.setNewVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getNewVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
