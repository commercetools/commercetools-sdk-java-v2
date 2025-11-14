
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemTaxedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemTaxedPriceChangeBuilder builder) {
        SetCustomLineItemTaxedPriceChange setCustomLineItemTaxedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemTaxedPriceChange).isInstanceOf(SetCustomLineItemTaxedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomLineItemTaxedPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCustomLineItemTaxedPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { "nextValue",
                        SetCustomLineItemTaxedPriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { "customLineItem",
                        SetCustomLineItemTaxedPriceChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemTaxedPriceChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemTaxedPriceChange value = SetCustomLineItemTaxedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemTaxedPriceChange value = SetCustomLineItemTaxedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemTaxedPriceChange value = SetCustomLineItemTaxedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemTaxedPriceChange value = SetCustomLineItemTaxedPriceChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemTaxedPriceChange value = SetCustomLineItemTaxedPriceChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
