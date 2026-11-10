
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeOrderHintChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeOrderHintChangeBuilder builder) {
        ChangeOrderHintChange changeOrderHintChange = builder.buildUnchecked();
        Assertions.assertThat(changeOrderHintChange).isInstanceOf(ChangeOrderHintChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeOrderHintChange.builder().change("change") },
                new Object[] { "previousValue", ChangeOrderHintChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeOrderHintChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeOrderHintChange value = ChangeOrderHintChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeOrderHintChange value = ChangeOrderHintChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeOrderHintChange value = ChangeOrderHintChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
