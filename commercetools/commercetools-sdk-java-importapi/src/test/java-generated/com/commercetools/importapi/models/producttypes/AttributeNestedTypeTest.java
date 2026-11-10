
package com.commercetools.importapi.models.producttypes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeNestedTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeNestedTypeBuilder builder) {
        AttributeNestedType attributeNestedType = builder.buildUnchecked();
        Assertions.assertThat(attributeNestedType).isInstanceOf(AttributeNestedType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "typeReference", AttributeNestedType.builder()
                .typeReference(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl()) } };
    }

    @Test
    public void typeReference() {
        AttributeNestedType value = AttributeNestedType.of();
        value.setTypeReference(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl());
        Assertions.assertThat(value.getTypeReference())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl());
    }
}
