
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMethodInfoInterfaceAccountChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMethodInfoInterfaceAccountChangeBuilder builder) {
        SetMethodInfoInterfaceAccountChange setMethodInfoInterfaceAccountChange = builder.buildUnchecked();
        Assertions.assertThat(setMethodInfoInterfaceAccountChange)
                .isInstanceOf(SetMethodInfoInterfaceAccountChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetMethodInfoInterfaceAccountChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetMethodInfoInterfaceAccountChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetMethodInfoInterfaceAccountChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetMethodInfoInterfaceAccountChange value = SetMethodInfoInterfaceAccountChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMethodInfoInterfaceAccountChange value = SetMethodInfoInterfaceAccountChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetMethodInfoInterfaceAccountChange value = SetMethodInfoInterfaceAccountChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
