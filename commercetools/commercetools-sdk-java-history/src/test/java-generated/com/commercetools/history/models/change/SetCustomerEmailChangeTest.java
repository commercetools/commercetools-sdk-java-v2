
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomerEmailChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomerEmailChangeBuilder builder) {
        SetCustomerEmailChange setCustomerEmailChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomerEmailChange).isInstanceOf(SetCustomerEmailChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomerEmailChange.builder().change("change") },
                new Object[] { "previousValue", SetCustomerEmailChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetCustomerEmailChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetCustomerEmailChange value = SetCustomerEmailChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomerEmailChange value = SetCustomerEmailChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCustomerEmailChange value = SetCustomerEmailChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
