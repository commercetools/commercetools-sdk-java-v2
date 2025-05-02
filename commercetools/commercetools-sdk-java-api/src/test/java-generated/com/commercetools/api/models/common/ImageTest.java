
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImageBuilder builder) {
        Image image = builder.buildUnchecked();
        Assertions.assertThat(image).isInstanceOf(Image.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "url", Image.builder().url("url") },
                new Object[] { "dimensions",
                        Image.builder().dimensions(new com.commercetools.api.models.common.ImageDimensionsImpl()) },
                new Object[] { "label", Image.builder().label("label") } };
    }

    @Test
    public void url() {
        Image value = Image.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }

    @Test
    public void dimensions() {
        Image value = Image.of();
        value.setDimensions(new com.commercetools.api.models.common.ImageDimensionsImpl());
        Assertions.assertThat(value.getDimensions())
                .isEqualTo(new com.commercetools.api.models.common.ImageDimensionsImpl());
    }

    @Test
    public void label() {
        Image value = Image.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }
}
