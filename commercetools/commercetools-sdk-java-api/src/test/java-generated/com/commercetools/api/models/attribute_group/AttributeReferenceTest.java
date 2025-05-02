
package com.commercetools.api.models.attribute_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeReferenceBuilder builder) {
        AttributeReference attributeReference = builder.buildUnchecked();
        Assertions.assertThat(attributeReference).isInstanceOf(AttributeReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", AttributeReference.builder().key("key") } };
    }

    @Test
    public void key() {
        AttributeReference value = AttributeReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
