
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetStatusInterfaceTextChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetStatusInterfaceTextChangeBuilder builder) {
        SetStatusInterfaceTextChange setStatusInterfaceTextChange = builder.buildUnchecked();
        Assertions.assertThat(setStatusInterfaceTextChange).isInstanceOf(SetStatusInterfaceTextChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetStatusInterfaceTextChange.builder().change("change") },
                new Object[] { "previousValue", SetStatusInterfaceTextChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetStatusInterfaceTextChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetStatusInterfaceTextChange value = SetStatusInterfaceTextChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStatusInterfaceTextChange value = SetStatusInterfaceTextChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetStatusInterfaceTextChange value = SetStatusInterfaceTextChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
