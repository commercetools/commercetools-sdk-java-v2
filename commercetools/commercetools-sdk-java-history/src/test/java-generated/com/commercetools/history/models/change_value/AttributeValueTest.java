
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeValueBuilder builder) {
        AttributeValue attributeValue = builder.buildUnchecked();
        Assertions.assertThat(attributeValue).isInstanceOf(AttributeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", AttributeValue.builder().name("name") },
                new Object[] { "value", AttributeValue.builder().value("value") } };
    }

    @Test
    public void name() {
        AttributeValue value = AttributeValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        AttributeValue value = AttributeValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
