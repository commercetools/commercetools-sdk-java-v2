
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FieldTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, FieldTypeBuilder builder) {
        FieldType fieldType = builder.buildUnchecked();
        Assertions.assertThat(fieldType).isInstanceOf(FieldType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", FieldType.builder().name("name") } };
    }

    @Test
    public void name() {
        FieldType value = FieldType.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
