
package com.commercetools.history.models.change;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class SetLineItemTaxedPriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemTaxedPriceChangeBuilder builder) {
        SetLineItemTaxedPriceChange setLineItemTaxedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemTaxedPriceChange).isInstanceOf(SetLineItemTaxedPriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemTaxedPriceChange.builder().change("change") },
                new Object[] { SetLineItemTaxedPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { SetLineItemTaxedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { SetLineItemTaxedPriceChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetLineItemTaxedPriceChange.builder().lineItemId("lineItemId") } };
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
