
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeChangeEnumValueLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeChangeEnumValueLabelActionBuilder builder) {
        TypeChangeEnumValueLabelAction typeChangeEnumValueLabelAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeEnumValueLabelAction).isInstanceOf(TypeChangeEnumValueLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeChangeEnumValueLabelAction.builder().fieldName("fieldName") },
                new Object[] { "value", TypeChangeEnumValueLabelAction.builder()
                        .value(new com.commercetools.api.models.type.CustomFieldEnumValueImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeChangeEnumValueLabelAction value = TypeChangeEnumValueLabelAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void value() {
        TypeChangeEnumValueLabelAction value = TypeChangeEnumValueLabelAction.of();
        value.setValue(new com.commercetools.api.models.type.CustomFieldEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldEnumValueImpl());
    }
}
