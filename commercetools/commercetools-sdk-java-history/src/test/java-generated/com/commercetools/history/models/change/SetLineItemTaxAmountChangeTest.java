
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemTaxAmountChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemTaxAmountChangeBuilder builder) {
        SetLineItemTaxAmountChange setLineItemTaxAmountChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemTaxAmountChange).isInstanceOf(SetLineItemTaxAmountChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemTaxAmountChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemTaxAmountChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "nextValue",
                        SetLineItemTaxAmountChange.builder()
                                .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "lineItem",
                        SetLineItemTaxAmountChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetLineItemTaxAmountChange.builder().variant("variant") },
                new Object[] { "taxMode", SetLineItemTaxAmountChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetLineItemTaxAmountChange value = SetLineItemTaxAmountChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemTaxAmountChange value = SetLineItemTaxAmountChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemTaxAmountChange value = SetLineItemTaxAmountChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemTaxAmountChange value = SetLineItemTaxAmountChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemTaxAmountChange value = SetLineItemTaxAmountChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void taxMode() {
        SetLineItemTaxAmountChange value = SetLineItemTaxAmountChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}
