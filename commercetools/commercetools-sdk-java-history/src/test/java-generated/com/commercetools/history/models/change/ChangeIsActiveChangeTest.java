
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeIsActiveChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeIsActiveChangeBuilder builder) {
        ChangeIsActiveChange changeIsActiveChange = builder.buildUnchecked();
        Assertions.assertThat(changeIsActiveChange).isInstanceOf(ChangeIsActiveChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeIsActiveChange.builder().change("change") },
                new Object[] { "previousValue", ChangeIsActiveChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeIsActiveChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeIsActiveChange value = ChangeIsActiveChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeIsActiveChange value = ChangeIsActiveChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeIsActiveChange value = ChangeIsActiveChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
