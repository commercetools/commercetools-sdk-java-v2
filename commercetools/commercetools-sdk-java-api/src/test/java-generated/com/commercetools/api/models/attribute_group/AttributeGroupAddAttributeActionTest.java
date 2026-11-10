
package com.commercetools.api.models.attribute_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupAddAttributeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupAddAttributeActionBuilder builder) {
        AttributeGroupAddAttributeAction attributeGroupAddAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupAddAttributeAction).isInstanceOf(AttributeGroupAddAttributeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "attribute", AttributeGroupAddAttributeAction.builder()
                .attribute(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()) } };
    }

    @Test
    public void attribute() {
        AttributeGroupAddAttributeAction value = AttributeGroupAddAttributeAction.of();
        value.setAttribute(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl());
        Assertions.assertThat(value.getAttribute())
                .isEqualTo(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl());
    }
}
