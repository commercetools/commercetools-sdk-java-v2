
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeInitialChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeInitialChangeBuilder builder) {
        ChangeInitialChange changeInitialChange = builder.buildUnchecked();
        Assertions.assertThat(changeInitialChange).isInstanceOf(ChangeInitialChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeInitialChange.builder().change("change") },
                new Object[] { "previousValue", ChangeInitialChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeInitialChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeInitialChange value = ChangeInitialChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeInitialChange value = ChangeInitialChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeInitialChange value = ChangeInitialChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
