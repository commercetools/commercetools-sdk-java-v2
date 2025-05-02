
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeAmountAuthorizedChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeAmountAuthorizedChangeBuilder builder) {
        ChangeAmountAuthorizedChange changeAmountAuthorizedChange = builder.buildUnchecked();
        Assertions.assertThat(changeAmountAuthorizedChange).isInstanceOf(ChangeAmountAuthorizedChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeAmountAuthorizedChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeAmountAuthorizedChange.builder()
                                .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "nextValue", ChangeAmountAuthorizedChange.builder()
                        .nextValue(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void change() {
        ChangeAmountAuthorizedChange value = ChangeAmountAuthorizedChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAmountAuthorizedChange value = ChangeAmountAuthorizedChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        ChangeAmountAuthorizedChange value = ChangeAmountAuthorizedChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
