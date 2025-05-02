
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemTaxedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemTaxedPriceChangeBuilder builder) {
        SetLineItemTaxedPriceChange setLineItemTaxedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemTaxedPriceChange).isInstanceOf(SetLineItemTaxedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemTaxedPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemTaxedPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { "nextValue",
                        SetLineItemTaxedPriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { "lineItem",
                        SetLineItemTaxedPriceChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItemId", SetLineItemTaxedPriceChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        SetLineItemTaxedPriceChange value = SetLineItemTaxedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemTaxedPriceChange value = SetLineItemTaxedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemTaxedPriceChange value = SetLineItemTaxedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemTaxedPriceChange value = SetLineItemTaxedPriceChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        SetLineItemTaxedPriceChange value = SetLineItemTaxedPriceChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
