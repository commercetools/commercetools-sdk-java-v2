
package com.commercetools.api.models.attribute_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupSetKeyActionBuilder builder) {
        AttributeGroupSetKeyAction attributeGroupSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupSetKeyAction).isInstanceOf(AttributeGroupSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", AttributeGroupSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        AttributeGroupSetKeyAction value = AttributeGroupSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
