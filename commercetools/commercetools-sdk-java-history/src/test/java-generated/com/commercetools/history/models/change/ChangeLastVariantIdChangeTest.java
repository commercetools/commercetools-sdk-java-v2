
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeLastVariantIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeLastVariantIdChangeBuilder builder) {
        ChangeLastVariantIdChange changeLastVariantIdChange = builder.buildUnchecked();
        Assertions.assertThat(changeLastVariantIdChange).isInstanceOf(ChangeLastVariantIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeLastVariantIdChange.builder().change("change") },
                new Object[] { "previousValue", ChangeLastVariantIdChange.builder().previousValue(8) },
                new Object[] { "nextValue", ChangeLastVariantIdChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        ChangeLastVariantIdChange value = ChangeLastVariantIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeLastVariantIdChange value = ChangeLastVariantIdChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeLastVariantIdChange value = ChangeLastVariantIdChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
