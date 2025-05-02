
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UnknownChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UnknownChangeBuilder builder) {
        UnknownChange unknownChange = builder.buildUnchecked();
        Assertions.assertThat(unknownChange).isInstanceOf(UnknownChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", UnknownChange.builder().change("change") },
                new Object[] { "previousValue", UnknownChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", UnknownChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        UnknownChange value = UnknownChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        UnknownChange value = UnknownChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        UnknownChange value = UnknownChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
