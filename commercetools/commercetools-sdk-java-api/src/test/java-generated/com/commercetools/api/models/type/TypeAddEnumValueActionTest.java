
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeAddEnumValueActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeAddEnumValueActionBuilder builder) {
        TypeAddEnumValueAction typeAddEnumValueAction = builder.buildUnchecked();
        Assertions.assertThat(typeAddEnumValueAction).isInstanceOf(TypeAddEnumValueAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fieldName", TypeAddEnumValueAction.builder().fieldName("fieldName") },
                new Object[] { "value", TypeAddEnumValueAction.builder()
                        .value(new com.commercetools.api.models.type.CustomFieldEnumValueImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeAddEnumValueAction value = TypeAddEnumValueAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void value() {
        TypeAddEnumValueAction value = TypeAddEnumValueAction.of();
        value.setValue(new com.commercetools.api.models.type.CustomFieldEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldEnumValueImpl());
    }
}
