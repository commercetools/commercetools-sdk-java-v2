
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FeatureRemovedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, FeatureRemovedErrorBuilder builder) {
        FeatureRemovedError featureRemovedError = builder.buildUnchecked();
        Assertions.assertThat(featureRemovedError).isInstanceOf(FeatureRemovedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", FeatureRemovedError.builder().message("message") } };
    }

    @Test
    public void message() {
        FeatureRemovedError value = FeatureRemovedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
