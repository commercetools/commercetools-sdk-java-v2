
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StringLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StringLabelBuilder builder) {
        StringLabel stringLabel = builder.buildUnchecked();
        Assertions.assertThat(stringLabel).isInstanceOf(StringLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", StringLabel.builder().value("value") } };
    }

    @Test
    public void value() {
        StringLabel value = StringLabel.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
