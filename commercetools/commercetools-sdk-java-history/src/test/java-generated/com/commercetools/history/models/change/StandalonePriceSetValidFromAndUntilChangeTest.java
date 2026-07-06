
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetValidFromAndUntilChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetValidFromAndUntilChangeBuilder builder) {
        StandalonePriceSetValidFromAndUntilChange standalonePriceSetValidFromAndUntilChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetValidFromAndUntilChange)
                .isInstanceOf(StandalonePriceSetValidFromAndUntilChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", StandalonePriceSetValidFromAndUntilChange.builder().change("change") },
                new Object[] { "previousValue",
                        StandalonePriceSetValidFromAndUntilChange.builder()
                                .previousValue(
                                    new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl()) },
                new Object[] { "nextValue", StandalonePriceSetValidFromAndUntilChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl()) } };
    }

    @Test
    public void change() {
        StandalonePriceSetValidFromAndUntilChange value = StandalonePriceSetValidFromAndUntilChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        StandalonePriceSetValidFromAndUntilChange value = StandalonePriceSetValidFromAndUntilChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
    }

    @Test
    public void nextValue() {
        StandalonePriceSetValidFromAndUntilChange value = StandalonePriceSetValidFromAndUntilChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
    }
}
