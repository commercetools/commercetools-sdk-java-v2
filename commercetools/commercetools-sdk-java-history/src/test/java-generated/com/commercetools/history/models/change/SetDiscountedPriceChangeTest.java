
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
public class SetDiscountedPriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetDiscountedPriceChangeBuilder builder) {
        SetDiscountedPriceChange setDiscountedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setDiscountedPriceChange).isInstanceOf(SetDiscountedPriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetDiscountedPriceChange.builder().change("change") },
                new Object[] { SetDiscountedPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { SetDiscountedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { SetDiscountedPriceChange.builder().catalogData("catalogData") },
                new Object[] { SetDiscountedPriceChange.builder().variant("variant") },
                new Object[] { SetDiscountedPriceChange.builder().priceId("priceId") } };
    }

    @Test
    public void change() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void nextValue() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void catalogData() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void priceId() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }
}
