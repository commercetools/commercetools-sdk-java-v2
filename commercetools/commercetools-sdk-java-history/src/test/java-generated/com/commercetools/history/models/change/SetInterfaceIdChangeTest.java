
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetInterfaceIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetInterfaceIdChangeBuilder builder) {
        SetInterfaceIdChange setInterfaceIdChange = builder.buildUnchecked();
        Assertions.assertThat(setInterfaceIdChange).isInstanceOf(SetInterfaceIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetInterfaceIdChange.builder().change("change") },
                new Object[] { "previousValue", SetInterfaceIdChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetInterfaceIdChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetInterfaceIdChange value = SetInterfaceIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetInterfaceIdChange value = SetInterfaceIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetInterfaceIdChange value = SetInterfaceIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
