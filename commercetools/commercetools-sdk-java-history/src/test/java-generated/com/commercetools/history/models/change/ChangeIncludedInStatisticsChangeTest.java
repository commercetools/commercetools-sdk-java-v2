
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeIncludedInStatisticsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeIncludedInStatisticsChangeBuilder builder) {
        ChangeIncludedInStatisticsChange changeIncludedInStatisticsChange = builder.buildUnchecked();
        Assertions.assertThat(changeIncludedInStatisticsChange).isInstanceOf(ChangeIncludedInStatisticsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeIncludedInStatisticsChange.builder().change("change") },
                new Object[] { "previousValue", ChangeIncludedInStatisticsChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeIncludedInStatisticsChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeIncludedInStatisticsChange value = ChangeIncludedInStatisticsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeIncludedInStatisticsChange value = ChangeIncludedInStatisticsChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeIncludedInStatisticsChange value = ChangeIncludedInStatisticsChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
