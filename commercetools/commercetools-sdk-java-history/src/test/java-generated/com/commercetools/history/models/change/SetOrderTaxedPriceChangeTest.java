
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
public class SetOrderTaxedPriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetOrderTaxedPriceChangeBuilder builder) {
        SetOrderTaxedPriceChange setOrderTaxedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setOrderTaxedPriceChange).isInstanceOf(SetOrderTaxedPriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetOrderTaxedPriceChange.builder().change("change") },
                new Object[] { SetOrderTaxedPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { SetOrderTaxedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { SetOrderTaxedPriceChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetOrderTaxedPriceChange value = SetOrderTaxedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetOrderTaxedPriceChange value = SetOrderTaxedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }

    @Test
    public void nextValue() {
        SetOrderTaxedPriceChange value = SetOrderTaxedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }

    @Test
    public void taxMode() {
        SetOrderTaxedPriceChange value = SetOrderTaxedPriceChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}
