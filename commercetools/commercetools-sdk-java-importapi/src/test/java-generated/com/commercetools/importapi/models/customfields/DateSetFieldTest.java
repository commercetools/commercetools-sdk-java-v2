
package com.commercetools.importapi.models.customfields;

import java.time.LocalDate;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DateSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DateSetFieldBuilder builder) {
        DateSetField dateSetField = builder.buildUnchecked();
        Assertions.assertThat(dateSetField).isInstanceOf(DateSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                DateSetField.builder().value(Collections.singletonList(LocalDate.parse("2023-06-01"))) } };
    }

    @Test
    public void value() {
        DateSetField value = DateSetField.of();
        value.setValue(Collections.singletonList(LocalDate.parse("2023-06-01")));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(LocalDate.parse("2023-06-01")));
    }
}
