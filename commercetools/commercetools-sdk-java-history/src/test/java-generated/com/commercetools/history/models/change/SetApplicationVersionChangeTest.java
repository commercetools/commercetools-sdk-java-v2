
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationVersionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationVersionChangeBuilder builder) {
        SetApplicationVersionChange setApplicationVersionChange = builder.buildUnchecked();
        Assertions.assertThat(setApplicationVersionChange).isInstanceOf(SetApplicationVersionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetApplicationVersionChange.builder().change("change") },
                new Object[] { "previousValue", SetApplicationVersionChange.builder().previousValue(8) },
                new Object[] { "nextValue", SetApplicationVersionChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetApplicationVersionChange value = SetApplicationVersionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetApplicationVersionChange value = SetApplicationVersionChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetApplicationVersionChange value = SetApplicationVersionChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
