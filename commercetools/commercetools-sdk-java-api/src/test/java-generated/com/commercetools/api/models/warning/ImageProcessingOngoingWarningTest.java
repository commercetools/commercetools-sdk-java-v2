
package com.commercetools.api.models.warning;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImageProcessingOngoingWarningTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImageProcessingOngoingWarningBuilder builder) {
        ImageProcessingOngoingWarning imageProcessingOngoingWarning = builder.buildUnchecked();
        Assertions.assertThat(imageProcessingOngoingWarning).isInstanceOf(ImageProcessingOngoingWarning.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ImageProcessingOngoingWarning.builder().message("message") } };
    }

    @Test
    public void message() {
        ImageProcessingOngoingWarning value = ImageProcessingOngoingWarning.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
