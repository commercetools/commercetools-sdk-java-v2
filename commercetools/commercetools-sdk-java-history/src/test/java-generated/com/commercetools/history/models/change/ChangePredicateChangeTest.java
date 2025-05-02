
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangePredicateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangePredicateChangeBuilder builder) {
        ChangePredicateChange changePredicateChange = builder.buildUnchecked();
        Assertions.assertThat(changePredicateChange).isInstanceOf(ChangePredicateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangePredicateChange.builder().change("change") },
                new Object[] { "previousValue", ChangePredicateChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangePredicateChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangePredicateChange value = ChangePredicateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePredicateChange value = ChangePredicateChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangePredicateChange value = ChangePredicateChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
