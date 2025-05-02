
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeKeyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeKeyChangeBuilder builder) {
        ChangeKeyChange changeKeyChange = builder.buildUnchecked();
        Assertions.assertThat(changeKeyChange).isInstanceOf(ChangeKeyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeKeyChange.builder().change("change") },
                new Object[] { "previousValue", ChangeKeyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeKeyChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeKeyChange value = ChangeKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeKeyChange value = ChangeKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeKeyChange value = ChangeKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
