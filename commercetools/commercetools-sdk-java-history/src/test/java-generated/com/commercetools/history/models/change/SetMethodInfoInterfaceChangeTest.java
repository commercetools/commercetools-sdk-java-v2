
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMethodInfoInterfaceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMethodInfoInterfaceChangeBuilder builder) {
        SetMethodInfoInterfaceChange setMethodInfoInterfaceChange = builder.buildUnchecked();
        Assertions.assertThat(setMethodInfoInterfaceChange).isInstanceOf(SetMethodInfoInterfaceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetMethodInfoInterfaceChange.builder().change("change") },
                new Object[] { "previousValue", SetMethodInfoInterfaceChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetMethodInfoInterfaceChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetMethodInfoInterfaceChange value = SetMethodInfoInterfaceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMethodInfoInterfaceChange value = SetMethodInfoInterfaceChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetMethodInfoInterfaceChange value = SetMethodInfoInterfaceChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
