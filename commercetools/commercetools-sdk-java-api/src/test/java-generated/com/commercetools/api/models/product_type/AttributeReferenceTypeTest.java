
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeReferenceTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeReferenceTypeBuilder builder) {
        AttributeReferenceType attributeReferenceType = builder.buildUnchecked();
        Assertions.assertThat(attributeReferenceType).isInstanceOf(AttributeReferenceType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "referenceTypeId", AttributeReferenceType.builder()
                .referenceTypeId(
                    com.commercetools.api.models.product_type.AttributeReferenceTypeId.findEnum("associate-role")) } };
    }

    @Test
    public void referenceTypeId() {
        AttributeReferenceType value = AttributeReferenceType.of();
        value.setReferenceTypeId(
            com.commercetools.api.models.product_type.AttributeReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getReferenceTypeId())
                .isEqualTo(
                    com.commercetools.api.models.product_type.AttributeReferenceTypeId.findEnum("associate-role"));
    }
}
