
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeTypeBuilder builder) {
        AttributeType attributeType = builder.buildUnchecked();
        Assertions.assertThat(attributeType).isInstanceOf(AttributeType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", AttributeType.builder().name("name") } };
    }

    @Test
    public void name() {
        AttributeType value = AttributeType.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
