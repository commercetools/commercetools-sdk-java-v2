
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetImagesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetImagesActionBuilder builder) {
        VariantSetImagesAction variantSetImagesAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetImagesAction).isInstanceOf(VariantSetImagesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "images", VariantSetImagesAction.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "staged", VariantSetImagesAction.builder().staged(true) } };
    }

    @Test
    public void images() {
        VariantSetImagesAction value = VariantSetImagesAction.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void staged() {
        VariantSetImagesAction value = VariantSetImagesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
