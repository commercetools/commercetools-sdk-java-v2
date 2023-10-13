
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
public class ProductPriceKeySetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceKeySetMessagePayloadBuilder builder) {
        ProductPriceKeySetMessagePayload productPriceKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceKeySetMessagePayload).isInstanceOf(ProductPriceKeySetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceKeySetMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPriceKeySetMessagePayload.builder().priceId("priceId") },
                new Object[] { ProductPriceKeySetMessagePayload.builder().oldKey("oldKey") },
                new Object[] { ProductPriceKeySetMessagePayload.builder().key("key") },
                new Object[] { ProductPriceKeySetMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceKeySetMessagePayload value = ProductPriceKeySetMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void priceId() {
        ProductPriceKeySetMessagePayload value = ProductPriceKeySetMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void oldKey() {
        ProductPriceKeySetMessagePayload value = ProductPriceKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }

    @Test
    public void key() {
        ProductPriceKeySetMessagePayload value = ProductPriceKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void staged() {
        ProductPriceKeySetMessagePayload value = ProductPriceKeySetMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
