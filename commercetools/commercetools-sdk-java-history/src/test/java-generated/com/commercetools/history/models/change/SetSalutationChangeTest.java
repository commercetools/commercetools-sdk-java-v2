
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetSalutationChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetSalutationChangeBuilder builder) {
        SetSalutationChange setSalutationChange = builder.buildUnchecked();
        Assertions.assertThat(setSalutationChange).isInstanceOf(SetSalutationChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetSalutationChange.builder().change("change") },
                new Object[] { "previousValue", SetSalutationChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetSalutationChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetSalutationChange value = SetSalutationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetSalutationChange value = SetSalutationChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetSalutationChange value = SetSalutationChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
