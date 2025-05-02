
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddLocalizedEnumValueChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddLocalizedEnumValueChangeBuilder builder) {
        AddLocalizedEnumValueChange addLocalizedEnumValueChange = builder.buildUnchecked();
        Assertions.assertThat(addLocalizedEnumValueChange).isInstanceOf(AddLocalizedEnumValueChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddLocalizedEnumValueChange.builder().change("change") },
                new Object[] { "nextValue", AddLocalizedEnumValueChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AttributeLocalizedEnumValueImpl()) },
                new Object[] { "fieldName", AddLocalizedEnumValueChange.builder().fieldName("fieldName") },
                new Object[] { "attributeName",
                        AddLocalizedEnumValueChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        AddLocalizedEnumValueChange value = AddLocalizedEnumValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddLocalizedEnumValueChange value = AddLocalizedEnumValueChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AttributeLocalizedEnumValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributeLocalizedEnumValueImpl());
    }

    @Test
    public void fieldName() {
        AddLocalizedEnumValueChange value = AddLocalizedEnumValueChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void attributeName() {
        AddLocalizedEnumValueChange value = AddLocalizedEnumValueChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
