
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPropertyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPropertyChangeBuilder builder) {
        SetPropertyChange setPropertyChange = builder.buildUnchecked();
        Assertions.assertThat(setPropertyChange).isInstanceOf(SetPropertyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetPropertyChange.builder().change("change") },
                new Object[] { "previousValue", SetPropertyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetPropertyChange.builder().nextValue("nextValue") },
                new Object[] { "path", SetPropertyChange.builder().path("path") } };
    }

    @Test
    public void change() {
        SetPropertyChange value = SetPropertyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPropertyChange value = SetPropertyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetPropertyChange value = SetPropertyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void path() {
        SetPropertyChange value = SetPropertyChange.of();
        value.setPath("path");
        Assertions.assertThat(value.getPath()).isEqualTo("path");
    }
}
