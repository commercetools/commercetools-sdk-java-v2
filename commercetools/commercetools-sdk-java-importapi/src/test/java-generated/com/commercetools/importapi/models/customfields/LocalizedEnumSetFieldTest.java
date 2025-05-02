
package com.commercetools.importapi.models.customfields;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizedEnumSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizedEnumSetFieldBuilder builder) {
        LocalizedEnumSetField localizedEnumSetField = builder.buildUnchecked();
        Assertions.assertThat(localizedEnumSetField).isInstanceOf(LocalizedEnumSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", LocalizedEnumSetField.builder().value(Collections.singletonList("value")) } };
    }

    @Test
    public void value() {
        LocalizedEnumSetField value = LocalizedEnumSetField.of();
        value.setValue(Collections.singletonList("value"));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList("value"));
    }
}
