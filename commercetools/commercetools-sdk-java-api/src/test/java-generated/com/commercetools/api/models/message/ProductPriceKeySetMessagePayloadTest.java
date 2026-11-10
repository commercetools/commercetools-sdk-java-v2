
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceKeySetMessagePayloadBuilder builder) {
        ProductPriceKeySetMessagePayload productPriceKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceKeySetMessagePayload).isInstanceOf(ProductPriceKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPriceKeySetMessagePayload.builder().variantId(5L) },
                new Object[] { "priceId", ProductPriceKeySetMessagePayload.builder().priceId("priceId") },
                new Object[] { "oldKey", ProductPriceKeySetMessagePayload.builder().oldKey("oldKey") },
                new Object[] { "key", ProductPriceKeySetMessagePayload.builder().key("key") },
                new Object[] { "staged", ProductPriceKeySetMessagePayload.builder().staged(true) } };
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
