
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeEnumValueLabelChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeEnumValueLabelChangeBuilder builder) {
        ChangeEnumValueLabelChange changeEnumValueLabelChange = builder.buildUnchecked();
        Assertions.assertThat(changeEnumValueLabelChange).isInstanceOf(ChangeEnumValueLabelChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeEnumValueLabelChange.builder().change("change") },
                new Object[] { "previousValue", ChangeEnumValueLabelChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeEnumValueLabelChange.builder().nextValue("nextValue") },
                new Object[] { "fieldName", ChangeEnumValueLabelChange.builder().fieldName("fieldName") },
                new Object[] { "valueKey", ChangeEnumValueLabelChange.builder().valueKey("valueKey") },
                new Object[] { "attributeName", ChangeEnumValueLabelChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void fieldName() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void valueKey() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setValueKey("valueKey");
        Assertions.assertThat(value.getValueKey()).isEqualTo("valueKey");
    }

    @Test
    public void attributeName() {
        ChangeEnumValueLabelChange value = ChangeEnumValueLabelChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
