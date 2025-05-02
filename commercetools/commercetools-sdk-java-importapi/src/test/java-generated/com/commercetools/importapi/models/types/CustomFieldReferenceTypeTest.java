
package com.commercetools.importapi.models.types;

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
        return new Object[][] { new Object[] { "referenceTypeId", CustomFieldReferenceType.builder()
                .referenceTypeId(
                    com.commercetools.importapi.models.types.CustomFieldReferenceValue.findEnum("associate-role")) } };
    }

    @Test
    public void referenceTypeId() {
        CustomFieldReferenceType value = CustomFieldReferenceType.of();
        value.setReferenceTypeId(
            com.commercetools.importapi.models.types.CustomFieldReferenceValue.findEnum("associate-role"));
        Assertions.assertThat(value.getReferenceTypeId())
                .isEqualTo(
                    com.commercetools.importapi.models.types.CustomFieldReferenceValue.findEnum("associate-role"));
    }
}
