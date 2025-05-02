
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetRestockableInDaysChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetRestockableInDaysChangeBuilder builder) {
        SetRestockableInDaysChange setRestockableInDaysChange = builder.buildUnchecked();
        Assertions.assertThat(setRestockableInDaysChange).isInstanceOf(SetRestockableInDaysChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetRestockableInDaysChange.builder().change("change") },
                new Object[] { "previousValue", SetRestockableInDaysChange.builder().previousValue(8) },
                new Object[] { "nextValue", SetRestockableInDaysChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetRestockableInDaysChange value = SetRestockableInDaysChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetRestockableInDaysChange value = SetRestockableInDaysChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetRestockableInDaysChange value = SetRestockableInDaysChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
