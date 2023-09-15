
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
public class SetShippingMethodTaxRateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetShippingMethodTaxRateChangeBuilder builder) {
        SetShippingMethodTaxRateChange setShippingMethodTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingMethodTaxRateChange).isInstanceOf(SetShippingMethodTaxRateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetShippingMethodTaxRateChange.builder().change("change") },
                new Object[] { SetShippingMethodTaxRateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { SetShippingMethodTaxRateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { SetShippingMethodTaxRateChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetShippingMethodTaxRateChange value = SetShippingMethodTaxRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingMethodTaxRateChange value = SetShippingMethodTaxRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void nextValue() {
        SetShippingMethodTaxRateChange value = SetShippingMethodTaxRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void taxMode() {
        SetShippingMethodTaxRateChange value = SetShippingMethodTaxRateChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}
