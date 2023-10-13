
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
public class ChangePriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangePriceChangeBuilder builder) {
        ChangePriceChange changePriceChange = builder.buildUnchecked();
        Assertions.assertThat(changePriceChange).isInstanceOf(ChangePriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangePriceChange.builder().change("change") },
                new Object[] { ChangePriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { ChangePriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { ChangePriceChange.builder().catalogData("catalogData") },
                new Object[] { ChangePriceChange.builder().priceId("priceId") } };
    }

    @Test
    public void change() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void nextValue() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void catalogData() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void priceId() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }
}
