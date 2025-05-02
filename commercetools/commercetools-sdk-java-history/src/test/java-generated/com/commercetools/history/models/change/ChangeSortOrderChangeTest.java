
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeSortOrderChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeSortOrderChangeBuilder builder) {
        ChangeSortOrderChange changeSortOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeSortOrderChange).isInstanceOf(ChangeSortOrderChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeSortOrderChange.builder().change("change") },
                new Object[] { "previousValue", ChangeSortOrderChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeSortOrderChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeSortOrderChange value = ChangeSortOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeSortOrderChange value = ChangeSortOrderChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeSortOrderChange value = ChangeSortOrderChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
