
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomFieldReferenceTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomFieldReferenceTypeBuilder builder) {
        CustomFieldReferenceType customFieldReferenceType = builder.buildUnchecked();
        Assertions.assertThat(customFieldReferenceType).isInstanceOf(CustomFieldReferenceType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "referenceTypeId",
                CustomFieldReferenceType.builder()
                        .referenceTypeId(
                            com.commercetools.api.models.type.CustomFieldReferenceValue.findEnum("approval-flow")) } };
    }

    @Test
    public void referenceTypeId() {
        CustomFieldReferenceType value = CustomFieldReferenceType.of();
        value.setReferenceTypeId(com.commercetools.api.models.type.CustomFieldReferenceValue.findEnum("approval-flow"));
        Assertions.assertThat(value.getReferenceTypeId())
                .isEqualTo(com.commercetools.api.models.type.CustomFieldReferenceValue.findEnum("approval-flow"));
    }
}
