
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImageDimensionsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImageDimensionsBuilder builder) {
        ImageDimensions imageDimensions = builder.buildUnchecked();
        Assertions.assertThat(imageDimensions).isInstanceOf(ImageDimensions.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "w", ImageDimensions.builder().w(5) },
                new Object[] { "h", ImageDimensions.builder().h(6) } };
    }

    @Test
    public void w() {
        ImageDimensions value = ImageDimensions.of();
        value.setW(5);
        Assertions.assertThat(value.getW()).isEqualTo(5);
    }

    @Test
    public void h() {
        ImageDimensions value = ImageDimensions.of();
        value.setH(6);
        Assertions.assertThat(value.getH()).isEqualTo(6);
    }
}
