
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLanguagesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLanguagesChangeBuilder builder) {
        SetLanguagesChange setLanguagesChange = builder.buildUnchecked();
        Assertions.assertThat(setLanguagesChange).isInstanceOf(SetLanguagesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLanguagesChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLanguagesChange.builder().previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue",
                        SetLanguagesChange.builder().nextValue(Collections.singletonList("nextValue")) } };
    }

    @Test
    public void change() {
        SetLanguagesChange value = SetLanguagesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLanguagesChange value = SetLanguagesChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        SetLanguagesChange value = SetLanguagesChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }
}
