
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCartPredicateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCartPredicateChangeBuilder builder) {
        SetCartPredicateChange setCartPredicateChange = builder.buildUnchecked();
        Assertions.assertThat(setCartPredicateChange).isInstanceOf(SetCartPredicateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCartPredicateChange.builder().change("change") },
                new Object[] { "previousValue", SetCartPredicateChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetCartPredicateChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetCartPredicateChange value = SetCartPredicateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCartPredicateChange value = SetCartPredicateChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCartPredicateChange value = SetCartPredicateChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
