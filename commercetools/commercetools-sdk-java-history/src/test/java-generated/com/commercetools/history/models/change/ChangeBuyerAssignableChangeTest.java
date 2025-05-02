
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeBuyerAssignableChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeBuyerAssignableChangeBuilder builder) {
        ChangeBuyerAssignableChange changeBuyerAssignableChange = builder.buildUnchecked();
        Assertions.assertThat(changeBuyerAssignableChange).isInstanceOf(ChangeBuyerAssignableChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeBuyerAssignableChange.builder().change("change") },
                new Object[] { "previousValue", ChangeBuyerAssignableChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeBuyerAssignableChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeBuyerAssignableChange value = ChangeBuyerAssignableChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeBuyerAssignableChange value = ChangeBuyerAssignableChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeBuyerAssignableChange value = ChangeBuyerAssignableChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
