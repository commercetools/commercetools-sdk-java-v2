
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
public class SetShippingInfoPriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetShippingInfoPriceChangeBuilder builder) {
        SetShippingInfoPriceChange setShippingInfoPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingInfoPriceChange).isInstanceOf(SetShippingInfoPriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetShippingInfoPriceChange.builder().change("change") },
                new Object[] { SetShippingInfoPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { SetShippingInfoPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void change() {
        SetShippingInfoPriceChange value = SetShippingInfoPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingInfoPriceChange value = SetShippingInfoPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        SetShippingInfoPriceChange value = SetShippingInfoPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
