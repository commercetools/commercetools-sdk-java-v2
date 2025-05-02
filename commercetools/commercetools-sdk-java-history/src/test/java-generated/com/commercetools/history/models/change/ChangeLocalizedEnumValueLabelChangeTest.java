
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeLocalizedEnumValueLabelChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeLocalizedEnumValueLabelChangeBuilder builder) {
        ChangeLocalizedEnumValueLabelChange changeLocalizedEnumValueLabelChange = builder.buildUnchecked();
        Assertions.assertThat(changeLocalizedEnumValueLabelChange)
                .isInstanceOf(ChangeLocalizedEnumValueLabelChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeLocalizedEnumValueLabelChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeLocalizedEnumValueLabelChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue",
                        ChangeLocalizedEnumValueLabelChange.builder()
                                .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "fieldName", ChangeLocalizedEnumValueLabelChange.builder().fieldName("fieldName") },
                new Object[] { "attributeName",
                        ChangeLocalizedEnumValueLabelChange.builder().attributeName("attributeName") },
                new Object[] { "valueKey", ChangeLocalizedEnumValueLabelChange.builder().valueKey("valueKey") } };
    }

    @Test
    public void change() {
        ChangeLocalizedEnumValueLabelChange value = ChangeLocalizedEnumValueLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeLocalizedEnumValueLabelChange value = ChangeLocalizedEnumValueLabelChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ChangeLocalizedEnumValueLabelChange value = ChangeLocalizedEnumValueLabelChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void fieldName() {
        ChangeLocalizedEnumValueLabelChange value = ChangeLocalizedEnumValueLabelChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void attributeName() {
        ChangeLocalizedEnumValueLabelChange value = ChangeLocalizedEnumValueLabelChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void valueKey() {
        ChangeLocalizedEnumValueLabelChange value = ChangeLocalizedEnumValueLabelChange.of();
        value.setValueKey("valueKey");
        Assertions.assertThat(value.getValueKey()).isEqualTo("valueKey");
    }
}
