
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemTaxRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemTaxRateChangeBuilder builder) {
        SetLineItemTaxRateChange setLineItemTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemTaxRateChange).isInstanceOf(SetLineItemTaxRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemTaxRateChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemTaxRateChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "nextValue",
                        SetLineItemTaxRateChange.builder()
                                .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "lineItem",
                        SetLineItemTaxRateChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetLineItemTaxRateChange.builder().variant("variant") },
                new Object[] { "taxMode",
                        SetLineItemTaxRateChange.builder()
                                .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) },
                new Object[] { "lineItemId", SetLineItemTaxRateChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        SetLineItemTaxRateChange value = SetLineItemTaxRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemTaxRateChange value = SetLineItemTaxRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemTaxRateChange value = SetLineItemTaxRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemTaxRateChange value = SetLineItemTaxRateChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemTaxRateChange value = SetLineItemTaxRateChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void taxMode() {
        SetLineItemTaxRateChange value = SetLineItemTaxRateChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }

    @Test
    public void lineItemId() {
        SetLineItemTaxRateChange value = SetLineItemTaxRateChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
