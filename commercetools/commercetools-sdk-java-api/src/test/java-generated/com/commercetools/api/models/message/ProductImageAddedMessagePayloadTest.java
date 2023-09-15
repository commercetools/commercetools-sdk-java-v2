
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
public class ProductImageAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductImageAddedMessagePayloadBuilder builder) {
        ProductImageAddedMessagePayload productImageAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productImageAddedMessagePayload).isInstanceOf(ProductImageAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductImageAddedMessagePayload.builder().variantId(5L) },
                new Object[] { ProductImageAddedMessagePayload.builder()
                        .image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { ProductImageAddedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductImageAddedMessagePayload value = ProductImageAddedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void image() {
        ProductImageAddedMessagePayload value = ProductImageAddedMessagePayload.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        ProductImageAddedMessagePayload value = ProductImageAddedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
