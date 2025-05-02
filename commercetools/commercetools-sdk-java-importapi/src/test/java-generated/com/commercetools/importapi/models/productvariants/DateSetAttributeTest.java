
package com.commercetools.importapi.models.productvariants;

import java.time.LocalDate;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DateSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DateSetAttributeBuilder builder) {
        DateSetAttribute dateSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(dateSetAttribute).isInstanceOf(DateSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                DateSetAttribute.builder().value(Collections.singletonList(LocalDate.parse("2023-06-01"))) } };
    }

    @Test
    public void value() {
        DateSetAttribute value = DateSetAttribute.of();
        value.setValue(Collections.singletonList(LocalDate.parse("2023-06-01")));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(LocalDate.parse("2023-06-01")));
    }
}
