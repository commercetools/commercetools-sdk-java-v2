
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizedStringFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizedStringFieldBuilder builder) {
        LocalizedStringField localizedStringField = builder.buildUnchecked();
        Assertions.assertThat(localizedStringField).isInstanceOf(LocalizedStringField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", LocalizedStringField.builder()
                .value(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void value() {
        LocalizedStringField value = LocalizedStringField.of();
        value.setValue(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
