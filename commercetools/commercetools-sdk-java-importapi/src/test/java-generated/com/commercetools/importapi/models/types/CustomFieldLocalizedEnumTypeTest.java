
package com.commercetools.importapi.models.types;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomFieldLocalizedEnumTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomFieldLocalizedEnumTypeBuilder builder) {
        CustomFieldLocalizedEnumType customFieldLocalizedEnumType = builder.buildUnchecked();
        Assertions.assertThat(customFieldLocalizedEnumType).isInstanceOf(CustomFieldLocalizedEnumType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "values",
                CustomFieldLocalizedEnumType.builder()
                        .values(Collections.singletonList(
                            new com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValueImpl())) } };
    }

    @Test
    public void values() {
        CustomFieldLocalizedEnumType value = CustomFieldLocalizedEnumType.of();
        value.setValues(Collections
                .singletonList(new com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValueImpl()));
    }
}
