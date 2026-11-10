
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetProductCountChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetProductCountChangeBuilder builder) {
        SetProductCountChange setProductCountChange = builder.buildUnchecked();
        Assertions.assertThat(setProductCountChange).isInstanceOf(SetProductCountChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetProductCountChange.builder().change("change") },
                new Object[] { "previousValue", SetProductCountChange.builder().previousValue(8) },
                new Object[] { "nextValue", SetProductCountChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetProductCountChange value = SetProductCountChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductCountChange value = SetProductCountChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetProductCountChange value = SetProductCountChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
