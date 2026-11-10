
package com.commercetools.importapi.models.types;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomFieldSetTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomFieldSetTypeBuilder builder) {
        CustomFieldSetType customFieldSetType = builder.buildUnchecked();
        Assertions.assertThat(customFieldSetType).isInstanceOf(CustomFieldSetType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "elementType", CustomFieldSetType.builder()
                .elementType(new com.commercetools.importapi.models.types.FieldTypeImpl()) } };
    }

    @Test
    public void elementType() {
        CustomFieldSetType value = CustomFieldSetType.of();
        value.setElementType(new com.commercetools.importapi.models.types.FieldTypeImpl());
        Assertions.assertThat(value.getElementType())
                .isEqualTo(new com.commercetools.importapi.models.types.FieldTypeImpl());
    }
}
