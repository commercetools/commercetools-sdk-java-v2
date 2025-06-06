
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetKeyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetKeyChangeBuilder builder) {
        SetKeyChange setKeyChange = builder.buildUnchecked();
        Assertions.assertThat(setKeyChange).isInstanceOf(SetKeyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetKeyChange.builder().change("change") },
                new Object[] { "previousValue", SetKeyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetKeyChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetKeyChange value = SetKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetKeyChange value = SetKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetKeyChange value = SetKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
