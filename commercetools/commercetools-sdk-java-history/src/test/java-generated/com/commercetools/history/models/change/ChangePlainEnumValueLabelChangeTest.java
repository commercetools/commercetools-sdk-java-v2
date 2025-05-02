
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangePlainEnumValueLabelChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangePlainEnumValueLabelChangeBuilder builder) {
        ChangePlainEnumValueLabelChange changePlainEnumValueLabelChange = builder.buildUnchecked();
        Assertions.assertThat(changePlainEnumValueLabelChange).isInstanceOf(ChangePlainEnumValueLabelChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangePlainEnumValueLabelChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangePlainEnumValueLabelChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangePlainEnumValueLabelChange.builder().nextValue("nextValue") },
                new Object[] { "attributeName",
                        ChangePlainEnumValueLabelChange.builder().attributeName("attributeName") },
                new Object[] { "valueKey", ChangePlainEnumValueLabelChange.builder().valueKey("valueKey") } };
    }

    @Test
    public void change() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void attributeName() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void valueKey() {
        ChangePlainEnumValueLabelChange value = ChangePlainEnumValueLabelChange.of();
        value.setValueKey("valueKey");
        Assertions.assertThat(value.getValueKey()).isEqualTo("valueKey");
    }
}
