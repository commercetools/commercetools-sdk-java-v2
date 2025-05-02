
package com.commercetools.importapi.models.customfields;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocalizedStringSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocalizedStringSetFieldBuilder builder) {
        LocalizedStringSetField localizedStringSetField = builder.buildUnchecked();
        Assertions.assertThat(localizedStringSetField).isInstanceOf(LocalizedStringSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", LocalizedStringSetField.builder()
                .value(
                    Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl())) } };
    }

    @Test
    public void value() {
        LocalizedStringSetField value = LocalizedStringSetField.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl()));
    }
}
