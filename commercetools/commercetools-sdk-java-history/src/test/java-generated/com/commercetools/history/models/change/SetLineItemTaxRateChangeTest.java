
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
public class SetLineItemTaxRateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemTaxRateChangeBuilder builder) {
        SetLineItemTaxRateChange setLineItemTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemTaxRateChange).isInstanceOf(SetLineItemTaxRateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemTaxRateChange.builder().change("change") },
                new Object[] { SetLineItemTaxRateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { SetLineItemTaxRateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { SetLineItemTaxRateChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetLineItemTaxRateChange.builder().variant("variant") },
                new Object[] { SetLineItemTaxRateChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
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
}
