
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
public class RemovePriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemovePriceChangeBuilder builder) {
        RemovePriceChange removePriceChange = builder.buildUnchecked();
        Assertions.assertThat(removePriceChange).isInstanceOf(RemovePriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemovePriceChange.builder().change("change") },
                new Object[] { RemovePriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { RemovePriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { RemovePriceChange.builder().catalogData("catalogData") },
                new Object[] { RemovePriceChange.builder().priceId("priceId") } };
    }

    @Test
    public void change() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void nextValue() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void catalogData() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void priceId() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }
}
