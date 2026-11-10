
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetExternalIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetExternalIdChangeBuilder builder) {
        SetExternalIdChange setExternalIdChange = builder.buildUnchecked();
        Assertions.assertThat(setExternalIdChange).isInstanceOf(SetExternalIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetExternalIdChange.builder().change("change") },
                new Object[] { "previousValue", SetExternalIdChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetExternalIdChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetExternalIdChange value = SetExternalIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetExternalIdChange value = SetExternalIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetExternalIdChange value = SetExternalIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
