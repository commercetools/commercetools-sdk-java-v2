
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceKeySetMessageBuilder builder) {
        ProductPriceKeySetMessage productPriceKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceKeySetMessage).isInstanceOf(ProductPriceKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPriceKeySetMessage.builder().variantId(5L) },
                new Object[] { "priceId", ProductPriceKeySetMessage.builder().priceId("priceId") },
                new Object[] { "oldKey", ProductPriceKeySetMessage.builder().oldKey("oldKey") },
                new Object[] { "key", ProductPriceKeySetMessage.builder().key("key") },
                new Object[] { "staged", ProductPriceKeySetMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void priceId() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void oldKey() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }

    @Test
    public void key() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void staged() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
