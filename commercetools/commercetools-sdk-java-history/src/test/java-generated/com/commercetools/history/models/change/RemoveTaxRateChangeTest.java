
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveTaxRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveTaxRateChangeBuilder builder) {
        RemoveTaxRateChange removeTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(removeTaxRateChange).isInstanceOf(RemoveTaxRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveTaxRateChange.builder().change("change") },
                new Object[] { "previousValue", RemoveTaxRateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) } };
    }

    @Test
    public void change() {
        RemoveTaxRateChange value = RemoveTaxRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveTaxRateChange value = RemoveTaxRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }
}
