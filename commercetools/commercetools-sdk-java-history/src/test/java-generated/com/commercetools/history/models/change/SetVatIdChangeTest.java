
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetVatIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetVatIdChangeBuilder builder) {
        SetVatIdChange setVatIdChange = builder.buildUnchecked();
        Assertions.assertThat(setVatIdChange).isInstanceOf(SetVatIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetVatIdChange.builder().change("change") },
                new Object[] { "previousValue", SetVatIdChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetVatIdChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetVatIdChange value = SetVatIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetVatIdChange value = SetVatIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetVatIdChange value = SetVatIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
