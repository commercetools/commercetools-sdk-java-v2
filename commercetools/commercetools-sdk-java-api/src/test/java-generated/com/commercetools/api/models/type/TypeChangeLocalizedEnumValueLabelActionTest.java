
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeChangeLocalizedEnumValueLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeChangeLocalizedEnumValueLabelActionBuilder builder) {
        TypeChangeLocalizedEnumValueLabelAction typeChangeLocalizedEnumValueLabelAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeLocalizedEnumValueLabelAction)
                .isInstanceOf(TypeChangeLocalizedEnumValueLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldName", TypeChangeLocalizedEnumValueLabelAction.builder().fieldName("fieldName") },
                new Object[] { "value", TypeChangeLocalizedEnumValueLabelAction.builder()
                        .value(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeChangeLocalizedEnumValueLabelAction value = TypeChangeLocalizedEnumValueLabelAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void value() {
        TypeChangeLocalizedEnumValueLabelAction value = TypeChangeLocalizedEnumValueLabelAction.of();
        value.setValue(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl());
    }
}
