
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StringFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StringFieldBuilder builder) {
        StringField stringField = builder.buildUnchecked();
        Assertions.assertThat(stringField).isInstanceOf(StringField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", StringField.builder().value("value") } };
    }

    @Test
    public void value() {
        StringField value = StringField.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
