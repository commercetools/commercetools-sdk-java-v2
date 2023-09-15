
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
public class ProductSelectionVariantExclusionChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionVariantExclusionChangedMessageBuilder builder) {
        ProductSelectionVariantExclusionChangedMessage productSelectionVariantExclusionChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionVariantExclusionChangedMessage)
                .isInstanceOf(ProductSelectionVariantExclusionChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionVariantExclusionChangedMessage.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductSelectionVariantExclusionChangedMessage.builder()
                        .oldVariantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) },
                new Object[] { ProductSelectionVariantExclusionChangedMessage.builder()
                        .newVariantExclusion(
                            new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionVariantExclusionChangedMessage value = ProductSelectionVariantExclusionChangedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void oldVariantExclusion() {
        ProductSelectionVariantExclusionChangedMessage value = ProductSelectionVariantExclusionChangedMessage.of();
        value.setOldVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getOldVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }

    @Test
    public void newVariantExclusion() {
        ProductSelectionVariantExclusionChangedMessage value = ProductSelectionVariantExclusionChangedMessage.of();
        value.setNewVariantExclusion(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getNewVariantExclusion())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantExclusionImpl());
    }
}
