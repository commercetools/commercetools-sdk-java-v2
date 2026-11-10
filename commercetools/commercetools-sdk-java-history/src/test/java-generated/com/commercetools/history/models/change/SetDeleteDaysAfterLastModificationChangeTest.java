
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDeleteDaysAfterLastModificationChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDeleteDaysAfterLastModificationChangeBuilder builder) {
        SetDeleteDaysAfterLastModificationChange setDeleteDaysAfterLastModificationChange = builder.buildUnchecked();
        Assertions.assertThat(setDeleteDaysAfterLastModificationChange)
                .isInstanceOf(SetDeleteDaysAfterLastModificationChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetDeleteDaysAfterLastModificationChange.builder().change("change") },
                new Object[] { "previousValue", SetDeleteDaysAfterLastModificationChange.builder().previousValue(8) },
                new Object[] { "nextValue", SetDeleteDaysAfterLastModificationChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetDeleteDaysAfterLastModificationChange value = SetDeleteDaysAfterLastModificationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDeleteDaysAfterLastModificationChange value = SetDeleteDaysAfterLastModificationChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetDeleteDaysAfterLastModificationChange value = SetDeleteDaysAfterLastModificationChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
