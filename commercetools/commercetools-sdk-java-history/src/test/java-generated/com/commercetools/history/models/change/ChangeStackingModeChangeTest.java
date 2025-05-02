
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeStackingModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeStackingModeChangeBuilder builder) {
        ChangeStackingModeChange changeStackingModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeStackingModeChange).isInstanceOf(ChangeStackingModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeStackingModeChange.builder().change("change") },
                new Object[] { "previousValue", ChangeStackingModeChange.builder()
                        .previousValue(com.commercetools.history.models.common.StackingMode.findEnum("Stacking")) },
                new Object[] { "nextValue", ChangeStackingModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.StackingMode.findEnum("Stacking")) } };
    }

    @Test
    public void change() {
        ChangeStackingModeChange value = ChangeStackingModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeStackingModeChange value = ChangeStackingModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.StackingMode.findEnum("Stacking"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.StackingMode.findEnum("Stacking"));
    }

    @Test
    public void nextValue() {
        ChangeStackingModeChange value = ChangeStackingModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.StackingMode.findEnum("Stacking"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.StackingMode.findEnum("Stacking"));
    }
}
