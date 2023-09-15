
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
public class ProductVariantAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantAddedMessagePayloadBuilder builder) {
        ProductVariantAddedMessagePayload productVariantAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productVariantAddedMessagePayload).isInstanceOf(ProductVariantAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductVariantAddedMessagePayload.builder()
                        .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { ProductVariantAddedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variant() {
        ProductVariantAddedMessagePayload value = ProductVariantAddedMessagePayload.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void staged() {
        ProductVariantAddedMessagePayload value = ProductVariantAddedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
