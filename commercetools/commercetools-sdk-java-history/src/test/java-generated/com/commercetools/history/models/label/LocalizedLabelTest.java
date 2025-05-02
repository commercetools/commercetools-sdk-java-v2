
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizedLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizedLabelBuilder builder) {
        LocalizedLabel localizedLabel = builder.buildUnchecked();
        Assertions.assertThat(localizedLabel).isInstanceOf(LocalizedLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                LocalizedLabel.builder().value(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void value() {
        LocalizedLabel value = LocalizedLabel.of();
        value.setValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
