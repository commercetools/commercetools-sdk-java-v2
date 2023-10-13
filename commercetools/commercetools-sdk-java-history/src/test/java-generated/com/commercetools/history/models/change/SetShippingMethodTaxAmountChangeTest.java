
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
public class SetShippingMethodTaxAmountChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetShippingMethodTaxAmountChangeBuilder builder) {
        SetShippingMethodTaxAmountChange setShippingMethodTaxAmountChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingMethodTaxAmountChange).isInstanceOf(SetShippingMethodTaxAmountChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetShippingMethodTaxAmountChange.builder().change("change") },
                new Object[] { SetShippingMethodTaxAmountChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl()) },
                new Object[] { SetShippingMethodTaxAmountChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl()) },
                new Object[] { SetShippingMethodTaxAmountChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetShippingMethodTaxAmountChange value = SetShippingMethodTaxAmountChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingMethodTaxAmountChange value = SetShippingMethodTaxAmountChange.of();
        value.setPreviousValue(
            new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl());
    }

    @Test
    public void nextValue() {
        SetShippingMethodTaxAmountChange value = SetShippingMethodTaxAmountChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl());
    }

    @Test
    public void taxMode() {
        SetShippingMethodTaxAmountChange value = SetShippingMethodTaxAmountChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}
