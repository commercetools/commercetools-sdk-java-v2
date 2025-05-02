
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDescriptionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDescriptionChangeBuilder builder) {
        SetDescriptionChange setDescriptionChange = builder.buildUnchecked();
        Assertions.assertThat(setDescriptionChange).isInstanceOf(SetDescriptionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDescriptionChange.builder().change("change") },
                new Object[] { "previousValue", SetDescriptionChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetDescriptionChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetDescriptionChange value = SetDescriptionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDescriptionChange value = SetDescriptionChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetDescriptionChange value = SetDescriptionChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
