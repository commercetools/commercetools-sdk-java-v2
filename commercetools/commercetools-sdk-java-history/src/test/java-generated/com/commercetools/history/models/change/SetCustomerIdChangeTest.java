
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomerIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomerIdChangeBuilder builder) {
        SetCustomerIdChange setCustomerIdChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomerIdChange).isInstanceOf(SetCustomerIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomerIdChange.builder().change("change") },
                new Object[] { "previousValue", SetCustomerIdChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetCustomerIdChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetCustomerIdChange value = SetCustomerIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomerIdChange value = SetCustomerIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCustomerIdChange value = SetCustomerIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
