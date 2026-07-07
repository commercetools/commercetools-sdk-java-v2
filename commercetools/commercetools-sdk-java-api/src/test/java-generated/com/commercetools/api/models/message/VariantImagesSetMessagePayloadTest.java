
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantImagesSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantImagesSetMessagePayloadBuilder builder) {
        VariantImagesSetMessagePayload variantImagesSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(variantImagesSetMessagePayload).isInstanceOf(VariantImagesSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "images", VariantImagesSetMessagePayload.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "oldImages", VariantImagesSetMessagePayload.builder()
                        .oldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "staged", VariantImagesSetMessagePayload.builder().staged(true) } };
    }

    @Test
    public void images() {
        VariantImagesSetMessagePayload value = VariantImagesSetMessagePayload.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void oldImages() {
        VariantImagesSetMessagePayload value = VariantImagesSetMessagePayload.of();
        value.setOldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getOldImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void staged() {
        VariantImagesSetMessagePayload value = VariantImagesSetMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
