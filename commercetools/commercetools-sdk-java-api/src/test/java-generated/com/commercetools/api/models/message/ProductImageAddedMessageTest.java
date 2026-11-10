
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductImageAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductImageAddedMessageBuilder builder) {
        ProductImageAddedMessage productImageAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productImageAddedMessage).isInstanceOf(ProductImageAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductImageAddedMessage.builder().variantId(5L) },
                new Object[] { "image",
                        ProductImageAddedMessage.builder().image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { "staged", ProductImageAddedMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductImageAddedMessage value = ProductImageAddedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void image() {
        ProductImageAddedMessage value = ProductImageAddedMessage.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        ProductImageAddedMessage value = ProductImageAddedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
