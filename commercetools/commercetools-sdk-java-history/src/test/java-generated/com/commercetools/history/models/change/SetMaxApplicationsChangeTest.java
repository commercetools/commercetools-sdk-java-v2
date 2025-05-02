
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMaxApplicationsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMaxApplicationsChangeBuilder builder) {
        SetMaxApplicationsChange setMaxApplicationsChange = builder.buildUnchecked();
        Assertions.assertThat(setMaxApplicationsChange).isInstanceOf(SetMaxApplicationsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetMaxApplicationsChange.builder().change("change") },
                new Object[] { "previousValue", SetMaxApplicationsChange.builder().previousValue(8) },
                new Object[] { "nextValue", SetMaxApplicationsChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetMaxApplicationsChange value = SetMaxApplicationsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMaxApplicationsChange value = SetMaxApplicationsChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetMaxApplicationsChange value = SetMaxApplicationsChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
