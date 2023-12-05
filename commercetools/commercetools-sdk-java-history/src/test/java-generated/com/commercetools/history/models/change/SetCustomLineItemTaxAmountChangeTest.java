
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
public class SetCustomLineItemTaxAmountChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCustomLineItemTaxAmountChangeBuilder builder) {
        SetCustomLineItemTaxAmountChange setCustomLineItemTaxAmountChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemTaxAmountChange).isInstanceOf(SetCustomLineItemTaxAmountChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCustomLineItemTaxAmountChange.builder().change("change") },
                new Object[] { SetCustomLineItemTaxAmountChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { SetCustomLineItemTaxAmountChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { SetCustomLineItemTaxAmountChange.builder()
                        .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetCustomLineItemTaxAmountChange.builder().customLineItemId("customLineItemId") },
                new Object[] { SetCustomLineItemTaxAmountChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetCustomLineItemTaxAmountChange value = SetCustomLineItemTaxAmountChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemTaxAmountChange value = SetCustomLineItemTaxAmountChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemTaxAmountChange value = SetCustomLineItemTaxAmountChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemTaxAmountChange value = SetCustomLineItemTaxAmountChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemTaxAmountChange value = SetCustomLineItemTaxAmountChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void taxMode() {
        SetCustomLineItemTaxAmountChange value = SetCustomLineItemTaxAmountChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}
