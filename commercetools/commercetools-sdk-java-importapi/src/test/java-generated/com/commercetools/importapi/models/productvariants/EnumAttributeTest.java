
package com.commercetools.importapi.models.productvariants;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumAttributeBuilder builder) {
        EnumAttribute enumAttribute = builder.buildUnchecked();
        Assertions.assertThat(enumAttribute).isInstanceOf(EnumAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", EnumAttribute.builder().value("value") } };
    }

    @Test
    public void value() {
        EnumAttribute value = EnumAttribute.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
