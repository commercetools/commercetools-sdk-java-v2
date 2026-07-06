
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantImageAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantImageAddedMessageBuilder builder) {
        VariantImageAddedMessage variantImageAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(variantImageAddedMessage).isInstanceOf(VariantImageAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "image",
                        VariantImageAddedMessage.builder().image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { "staged", VariantImageAddedMessage.builder().staged(true) } };
    }

    @Test
    public void image() {
        VariantImageAddedMessage value = VariantImageAddedMessage.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        VariantImageAddedMessage value = VariantImageAddedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
