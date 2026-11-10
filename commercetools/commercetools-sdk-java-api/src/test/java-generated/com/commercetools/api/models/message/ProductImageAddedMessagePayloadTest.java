
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductImageAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductImageAddedMessagePayloadBuilder builder) {
        ProductImageAddedMessagePayload productImageAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productImageAddedMessagePayload).isInstanceOf(ProductImageAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductImageAddedMessagePayload.builder().variantId(5L) },
                new Object[] { "image",
                        ProductImageAddedMessagePayload.builder()
                                .image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { "staged", ProductImageAddedMessagePayload.builder().staged(true) } };
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
