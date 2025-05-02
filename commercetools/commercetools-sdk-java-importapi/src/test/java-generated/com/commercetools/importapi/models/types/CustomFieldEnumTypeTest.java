
package com.commercetools.importapi.models.types;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomFieldEnumTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomFieldEnumTypeBuilder builder) {
        CustomFieldEnumType customFieldEnumType = builder.buildUnchecked();
        Assertions.assertThat(customFieldEnumType).isInstanceOf(CustomFieldEnumType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "values",
                CustomFieldEnumType.builder()
                        .values(Collections.singletonList(
                            new com.commercetools.importapi.models.types.CustomFieldEnumValueImpl())) } };
    }

    @Test
    public void values() {
        CustomFieldEnumType value = CustomFieldEnumType.of();
        value.setValues(
            Collections.singletonList(new com.commercetools.importapi.models.types.CustomFieldEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.types.CustomFieldEnumValueImpl()));
    }
}
