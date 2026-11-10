
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetStatusInterfaceCodeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetStatusInterfaceCodeChangeBuilder builder) {
        SetStatusInterfaceCodeChange setStatusInterfaceCodeChange = builder.buildUnchecked();
        Assertions.assertThat(setStatusInterfaceCodeChange).isInstanceOf(SetStatusInterfaceCodeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetStatusInterfaceCodeChange.builder().change("change") },
                new Object[] { "previousValue", SetStatusInterfaceCodeChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetStatusInterfaceCodeChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetStatusInterfaceCodeChange value = SetStatusInterfaceCodeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStatusInterfaceCodeChange value = SetStatusInterfaceCodeChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetStatusInterfaceCodeChange value = SetStatusInterfaceCodeChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
