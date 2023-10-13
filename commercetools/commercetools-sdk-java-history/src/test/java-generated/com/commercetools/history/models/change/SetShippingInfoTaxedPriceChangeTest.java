
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
public class SetShippingInfoTaxedPriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetShippingInfoTaxedPriceChangeBuilder builder) {
        SetShippingInfoTaxedPriceChange setShippingInfoTaxedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingInfoTaxedPriceChange).isInstanceOf(SetShippingInfoTaxedPriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetShippingInfoTaxedPriceChange.builder().change("change") },
                new Object[] { SetShippingInfoTaxedPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TaxedPriceImpl()) },
                new Object[] { SetShippingInfoTaxedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxedPriceImpl()) } };
    }

    @Test
    public void change() {
        SetShippingInfoTaxedPriceChange value = SetShippingInfoTaxedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingInfoTaxedPriceChange value = SetShippingInfoTaxedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }

    @Test
    public void nextValue() {
        SetShippingInfoTaxedPriceChange value = SetShippingInfoTaxedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }
}
