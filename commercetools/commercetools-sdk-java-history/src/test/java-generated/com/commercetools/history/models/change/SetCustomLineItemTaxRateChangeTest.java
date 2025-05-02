
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemTaxRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemTaxRateChangeBuilder builder) {
        SetCustomLineItemTaxRateChange setCustomLineItemTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemTaxRateChange).isInstanceOf(SetCustomLineItemTaxRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomLineItemTaxRateChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCustomLineItemTaxRateChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "nextValue",
                        SetCustomLineItemTaxRateChange.builder()
                                .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "customLineItem",
                        SetCustomLineItemTaxRateChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemTaxRateChange.builder().customLineItemId("customLineItemId") },
                new Object[] { "taxMode", SetCustomLineItemTaxRateChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetCustomLineItemTaxRateChange value = SetCustomLineItemTaxRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemTaxRateChange value = SetCustomLineItemTaxRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemTaxRateChange value = SetCustomLineItemTaxRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemTaxRateChange value = SetCustomLineItemTaxRateChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemTaxRateChange value = SetCustomLineItemTaxRateChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void taxMode() {
        SetCustomLineItemTaxRateChange value = SetCustomLineItemTaxRateChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}
