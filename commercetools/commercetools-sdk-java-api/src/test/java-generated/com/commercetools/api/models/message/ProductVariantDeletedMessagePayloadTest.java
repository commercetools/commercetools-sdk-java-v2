
package com.commercetools.api.models.message;

import java.util.Collections;

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
public class ProductVariantDeletedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantDeletedMessagePayloadBuilder builder) {
        ProductVariantDeletedMessagePayload productVariantDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productVariantDeletedMessagePayload)
                .isInstanceOf(ProductVariantDeletedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductVariantDeletedMessagePayload.builder()
                        .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { ProductVariantDeletedMessagePayload.builder()
                        .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { ProductVariantDeletedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variant() {
        ProductVariantDeletedMessagePayload value = ProductVariantDeletedMessagePayload.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void removedImageUrls() {
        ProductVariantDeletedMessagePayload value = ProductVariantDeletedMessagePayload.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void staged() {
        ProductVariantDeletedMessagePayload value = ProductVariantDeletedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
