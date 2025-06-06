
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetRatingChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetRatingChangeBuilder builder) {
        SetRatingChange setRatingChange = builder.buildUnchecked();
        Assertions.assertThat(setRatingChange).isInstanceOf(SetRatingChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetRatingChange.builder().change("change") },
                new Object[] { "previousValue", SetRatingChange.builder().previousValue(8) },
                new Object[] { "nextValue", SetRatingChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetRatingChange value = SetRatingChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetRatingChange value = SetRatingChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetRatingChange value = SetRatingChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
