
package com.commercetools.api.models.standalone_price;

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
public class StandalonePriceRemovePriceTierActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceRemovePriceTierActionBuilder builder) {
        StandalonePriceRemovePriceTierAction standalonePriceRemovePriceTierAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceRemovePriceTierAction)
                .isInstanceOf(StandalonePriceRemovePriceTierAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceRemovePriceTierAction.builder().tierMinimumQuantity(3L) } };
    }

    @Test
    public void tierMinimumQuantity() {
        StandalonePriceRemovePriceTierAction value = StandalonePriceRemovePriceTierAction.of();
        value.setTierMinimumQuantity(3L);
        Assertions.assertThat(value.getTierMinimumQuantity()).isEqualTo(3L);
    }
}
