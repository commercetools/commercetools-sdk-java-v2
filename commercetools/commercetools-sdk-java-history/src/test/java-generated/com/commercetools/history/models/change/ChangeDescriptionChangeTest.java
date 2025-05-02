
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeDescriptionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeDescriptionChangeBuilder builder) {
        ChangeDescriptionChange changeDescriptionChange = builder.buildUnchecked();
        Assertions.assertThat(changeDescriptionChange).isInstanceOf(ChangeDescriptionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeDescriptionChange.builder().change("change") },
                new Object[] { "previousValue", ChangeDescriptionChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeDescriptionChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeDescriptionChange value = ChangeDescriptionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeDescriptionChange value = ChangeDescriptionChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeDescriptionChange value = ChangeDescriptionChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
