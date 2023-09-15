
package com.commercetools.ml.models.common;

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
public class ProductVariantTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantBuilder builder) {
        ProductVariant productVariant = builder.buildUnchecked();
        Assertions.assertThat(productVariant).isInstanceOf(ProductVariant.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductVariant.builder()
                        .product(new com.commercetools.ml.models.common.ProductReferenceImpl()) },
                new Object[] { ProductVariant.builder().staged(true) },
                new Object[] { ProductVariant.builder().variantId(5) } };
    }

    @Test
    public void product() {
        ProductVariant value = ProductVariant.of();
        value.setProduct(new com.commercetools.ml.models.common.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.ml.models.common.ProductReferenceImpl());
    }

    @Test
    public void staged() {
        ProductVariant value = ProductVariant.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void variantId() {
        ProductVariant value = ProductVariant.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }
}
