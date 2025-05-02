
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeCartPredicateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeCartPredicateChangeBuilder builder) {
        ChangeCartPredicateChange changeCartPredicateChange = builder.buildUnchecked();
        Assertions.assertThat(changeCartPredicateChange).isInstanceOf(ChangeCartPredicateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeCartPredicateChange.builder().change("change") },
                new Object[] { "previousValue", ChangeCartPredicateChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeCartPredicateChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeCartPredicateChange value = ChangeCartPredicateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeCartPredicateChange value = ChangeCartPredicateChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeCartPredicateChange value = ChangeCartPredicateChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
