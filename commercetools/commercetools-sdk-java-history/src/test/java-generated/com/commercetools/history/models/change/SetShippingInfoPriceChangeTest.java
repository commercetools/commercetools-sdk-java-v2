
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingInfoPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingInfoPriceChangeBuilder builder) {
        SetShippingInfoPriceChange setShippingInfoPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingInfoPriceChange).isInstanceOf(SetShippingInfoPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetShippingInfoPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetShippingInfoPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "nextValue", SetShippingInfoPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void change() {
        SetShippingInfoPriceChange value = SetShippingInfoPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingInfoPriceChange value = SetShippingInfoPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        SetShippingInfoPriceChange value = SetShippingInfoPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
