
package com.commercetools.api.models.attribute_group;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupSetAttributesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupSetAttributesActionBuilder builder) {
        AttributeGroupSetAttributesAction attributeGroupSetAttributesAction = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupSetAttributesAction).isInstanceOf(AttributeGroupSetAttributesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "attributes",
                AttributeGroupSetAttributesAction.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.attribute_group.AttributeReferenceImpl())) } };
    }

    @Test
    public void attributes() {
        AttributeGroupSetAttributesAction value = AttributeGroupSetAttributesAction.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
    }
}
