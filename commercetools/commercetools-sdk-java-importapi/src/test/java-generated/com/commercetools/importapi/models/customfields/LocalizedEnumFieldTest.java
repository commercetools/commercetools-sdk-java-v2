
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizedEnumFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizedEnumFieldBuilder builder) {
        LocalizedEnumField localizedEnumField = builder.buildUnchecked();
        Assertions.assertThat(localizedEnumField).isInstanceOf(LocalizedEnumField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", LocalizedEnumField.builder().value("value") } };
    }

    @Test
    public void value() {
        LocalizedEnumField value = LocalizedEnumField.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
