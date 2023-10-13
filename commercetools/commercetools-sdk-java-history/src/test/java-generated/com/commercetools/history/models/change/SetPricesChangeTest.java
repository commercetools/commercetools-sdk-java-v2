
package com.commercetools.history.models.change;

import java.util.Collections;

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
public class SetPricesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetPricesChangeBuilder builder) {
        SetPricesChange setPricesChange = builder.buildUnchecked();
        Assertions.assertThat(setPricesChange).isInstanceOf(SetPricesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetPricesChange.builder().change("change") },
                new Object[] {
                        SetPricesChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceImpl())) },
                new Object[] {
                        SetPricesChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceImpl())) },
                new Object[] { SetPricesChange.builder().catalogData("catalogData") },
                new Object[] { SetPricesChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetPricesChange value = SetPricesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPricesChange value = SetPricesChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
    }

    @Test
    public void nextValue() {
        SetPricesChange value = SetPricesChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
    }

    @Test
    public void catalogData() {
        SetPricesChange value = SetPricesChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetPricesChange value = SetPricesChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
