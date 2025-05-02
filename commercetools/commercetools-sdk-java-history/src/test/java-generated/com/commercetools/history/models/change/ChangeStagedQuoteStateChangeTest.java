
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeStagedQuoteStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeStagedQuoteStateChangeBuilder builder) {
        ChangeStagedQuoteStateChange changeStagedQuoteStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeStagedQuoteStateChange).isInstanceOf(ChangeStagedQuoteStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeStagedQuoteStateChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeStagedQuoteStateChange.builder()
                                .previousValue(
                                    com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress")) },
                new Object[] { "nextValue", ChangeStagedQuoteStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress")) } };
    }

    @Test
    public void change() {
        ChangeStagedQuoteStateChange value = ChangeStagedQuoteStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeStagedQuoteStateChange value = ChangeStagedQuoteStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress"));
    }

    @Test
    public void nextValue() {
        ChangeStagedQuoteStateChange value = ChangeStagedQuoteStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress"));
    }
}
