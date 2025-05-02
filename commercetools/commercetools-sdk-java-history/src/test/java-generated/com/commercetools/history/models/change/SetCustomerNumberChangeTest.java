
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomerNumberChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomerNumberChangeBuilder builder) {
        SetCustomerNumberChange setCustomerNumberChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomerNumberChange).isInstanceOf(SetCustomerNumberChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomerNumberChange.builder().change("change") },
                new Object[] { "previousValue", SetCustomerNumberChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetCustomerNumberChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetCustomerNumberChange value = SetCustomerNumberChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomerNumberChange value = SetCustomerNumberChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCustomerNumberChange value = SetCustomerNumberChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
