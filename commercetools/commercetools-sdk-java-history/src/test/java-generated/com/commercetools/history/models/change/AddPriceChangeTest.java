
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
public class AddPriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddPriceChangeBuilder builder) {
        AddPriceChange addPriceChange = builder.buildUnchecked();
        Assertions.assertThat(addPriceChange).isInstanceOf(AddPriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddPriceChange.builder().change("change") },
                new Object[] {
                        AddPriceChange.builder().nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { AddPriceChange.builder().catalogData("catalogData") },
                new Object[] { AddPriceChange.builder().priceId("priceId") } };
    }

    @Test
    public void change() {
        AddPriceChange value = AddPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddPriceChange value = AddPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void catalogData() {
        AddPriceChange value = AddPriceChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void priceId() {
        AddPriceChange value = AddPriceChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }
}
