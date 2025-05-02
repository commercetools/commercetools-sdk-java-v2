
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddEnumValueChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddEnumValueChangeBuilder builder) {
        AddEnumValueChange addEnumValueChange = builder.buildUnchecked();
        Assertions.assertThat(addEnumValueChange).isInstanceOf(AddEnumValueChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddEnumValueChange.builder().change("change") },
                new Object[] { "nextValue",
                        AddEnumValueChange.builder()
                                .nextValue(new com.commercetools.history.models.change_value.EnumValueImpl()) },
                new Object[] { "fieldName", AddEnumValueChange.builder().fieldName("fieldName") } };
    }

    @Test
    public void change() {
        AddEnumValueChange value = AddEnumValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddEnumValueChange value = AddEnumValueChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.EnumValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.EnumValueImpl());
    }

    @Test
    public void fieldName() {
        AddEnumValueChange value = AddEnumValueChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }
}
