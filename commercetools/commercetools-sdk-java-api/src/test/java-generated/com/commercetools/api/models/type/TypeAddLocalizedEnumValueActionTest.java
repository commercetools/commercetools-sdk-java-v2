
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeAddLocalizedEnumValueActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeAddLocalizedEnumValueActionBuilder builder) {
        TypeAddLocalizedEnumValueAction typeAddLocalizedEnumValueAction = builder.buildUnchecked();
        Assertions.assertThat(typeAddLocalizedEnumValueAction).isInstanceOf(TypeAddLocalizedEnumValueAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeAddLocalizedEnumValueAction.builder().fieldName("fieldName") },
                new Object[] { "value", TypeAddLocalizedEnumValueAction.builder()
                        .value(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeAddLocalizedEnumValueAction value = TypeAddLocalizedEnumValueAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void value() {
        TypeAddLocalizedEnumValueAction value = TypeAddLocalizedEnumValueAction.of();
        value.setValue(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl());
    }
}
