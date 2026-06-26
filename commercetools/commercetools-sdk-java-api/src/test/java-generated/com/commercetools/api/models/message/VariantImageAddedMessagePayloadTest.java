
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantImageAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantImageAddedMessagePayloadBuilder builder) {
        VariantImageAddedMessagePayload variantImageAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(variantImageAddedMessagePayload).isInstanceOf(VariantImageAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "image",
                        VariantImageAddedMessagePayload.builder()
                                .image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { "staged", VariantImageAddedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void image() {
        VariantImageAddedMessagePayload value = VariantImageAddedMessagePayload.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        VariantImageAddedMessagePayload value = VariantImageAddedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
