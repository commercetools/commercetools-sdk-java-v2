
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddTaxRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddTaxRateChangeBuilder builder) {
        AddTaxRateChange addTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(addTaxRateChange).isInstanceOf(AddTaxRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddTaxRateChange.builder().change("change") }, new Object[] {
                "nextValue",
                AddTaxRateChange.builder().nextValue(new com.commercetools.history.models.common.TaxRateImpl()) } };
    }

    @Test
    public void change() {
        AddTaxRateChange value = AddTaxRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddTaxRateChange value = AddTaxRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }
}
