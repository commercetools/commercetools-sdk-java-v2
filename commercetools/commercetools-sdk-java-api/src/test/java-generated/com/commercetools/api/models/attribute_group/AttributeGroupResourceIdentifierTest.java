
package com.commercetools.api.models.attribute_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupResourceIdentifierBuilder builder) {
        AttributeGroupResourceIdentifier attributeGroupResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupResourceIdentifier).isInstanceOf(AttributeGroupResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", AttributeGroupResourceIdentifier.builder().id("id") },
                new Object[] { "key", AttributeGroupResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        AttributeGroupResourceIdentifier value = AttributeGroupResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        AttributeGroupResourceIdentifier value = AttributeGroupResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
