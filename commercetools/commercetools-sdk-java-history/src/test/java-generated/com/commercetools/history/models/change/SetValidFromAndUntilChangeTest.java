
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetValidFromAndUntilChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetValidFromAndUntilChangeBuilder builder) {
        SetValidFromAndUntilChange setValidFromAndUntilChange = builder.buildUnchecked();
        Assertions.assertThat(setValidFromAndUntilChange).isInstanceOf(SetValidFromAndUntilChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetValidFromAndUntilChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetValidFromAndUntilChange.builder()
                                .previousValue(
                                    new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl()) },
                new Object[] { "nextValue", SetValidFromAndUntilChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl()) } };
    }

    @Test
    public void change() {
        SetValidFromAndUntilChange value = SetValidFromAndUntilChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetValidFromAndUntilChange value = SetValidFromAndUntilChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
    }

    @Test
    public void nextValue() {
        SetValidFromAndUntilChange value = SetValidFromAndUntilChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
    }
}
