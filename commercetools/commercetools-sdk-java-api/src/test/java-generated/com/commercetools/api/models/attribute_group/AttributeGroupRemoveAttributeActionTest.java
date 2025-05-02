
package com.commercetools.api.models.attribute_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupRemoveAttributeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupRemoveAttributeActionBuilder builder) {
        AttributeGroupRemoveAttributeAction attributeGroupRemoveAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupRemoveAttributeAction)
                .isInstanceOf(AttributeGroupRemoveAttributeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "attribute", AttributeGroupRemoveAttributeAction.builder()
                .attribute(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()) } };
    }

    @Test
    public void attribute() {
        AttributeGroupRemoveAttributeAction value = AttributeGroupRemoveAttributeAction.of();
        value.setAttribute(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl());
        Assertions.assertThat(value.getAttribute())
                .isEqualTo(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl());
    }
}
