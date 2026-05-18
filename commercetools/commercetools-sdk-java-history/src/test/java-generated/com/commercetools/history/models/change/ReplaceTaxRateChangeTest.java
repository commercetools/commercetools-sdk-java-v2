
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReplaceTaxRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReplaceTaxRateChangeBuilder builder) {
        ReplaceTaxRateChange replaceTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(replaceTaxRateChange).isInstanceOf(ReplaceTaxRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ReplaceTaxRateChange.builder().change("change") },
                new Object[] { "previousValue",
                        ReplaceTaxRateChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "nextValue", ReplaceTaxRateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) } };
    }

    @Test
    public void change() {
        ReplaceTaxRateChange value = ReplaceTaxRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ReplaceTaxRateChange value = ReplaceTaxRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void nextValue() {
        ReplaceTaxRateChange value = ReplaceTaxRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }
}
