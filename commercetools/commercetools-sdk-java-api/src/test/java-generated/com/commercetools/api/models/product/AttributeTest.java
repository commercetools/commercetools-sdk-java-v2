
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeBuilder builder) {
        Attribute attribute = builder.buildUnchecked();
        Assertions.assertThat(attribute).isInstanceOf(Attribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", Attribute.builder().name("name") },
                new Object[] { "value", Attribute.builder().value("value") } };
    }

    @Test
    public void name() {
        Attribute value = Attribute.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        Attribute value = Attribute.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
