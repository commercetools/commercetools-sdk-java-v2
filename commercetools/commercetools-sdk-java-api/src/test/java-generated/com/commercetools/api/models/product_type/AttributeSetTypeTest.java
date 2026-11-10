
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeSetTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeSetTypeBuilder builder) {
        AttributeSetType attributeSetType = builder.buildUnchecked();
        Assertions.assertThat(attributeSetType).isInstanceOf(AttributeSetType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "elementType", AttributeSetType.builder()
                .elementType(new com.commercetools.api.models.product_type.AttributeTypeImpl()) } };
    }

    @Test
    public void elementType() {
        AttributeSetType value = AttributeSetType.of();
        value.setElementType(new com.commercetools.api.models.product_type.AttributeTypeImpl());
        Assertions.assertThat(value.getElementType())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributeTypeImpl());
    }
}
