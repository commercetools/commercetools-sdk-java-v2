
package com.commercetools.api.models.product_type;

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
                .typeReference(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl()) } };
    }

    @Test
    public void typeReference() {
        AttributeNestedType value = AttributeNestedType.of();
        value.setTypeReference(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
        Assertions.assertThat(value.getTypeReference())
                .isEqualTo(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
    }
}
