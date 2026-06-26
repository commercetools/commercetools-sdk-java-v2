
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantImagesSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantImagesSetMessageBuilder builder) {
        VariantImagesSetMessage variantImagesSetMessage = builder.buildUnchecked();
        Assertions.assertThat(variantImagesSetMessage).isInstanceOf(VariantImagesSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "images", VariantImagesSetMessage.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "oldImages", VariantImagesSetMessage.builder()
                        .oldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "staged", VariantImagesSetMessage.builder().staged(true) } };
    }

    @Test
    public void images() {
        VariantImagesSetMessage value = VariantImagesSetMessage.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void oldImages() {
        VariantImagesSetMessage value = VariantImagesSetMessage.of();
        value.setOldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getOldImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void staged() {
        VariantImagesSetMessage value = VariantImagesSetMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
