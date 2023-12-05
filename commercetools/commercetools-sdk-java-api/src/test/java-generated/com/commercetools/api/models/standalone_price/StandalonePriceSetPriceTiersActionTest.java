
package com.commercetools.api.models.standalone_price;

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
public class StandalonePriceSetPriceTiersActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceSetPriceTiersActionBuilder builder) {
        StandalonePriceSetPriceTiersAction standalonePriceSetPriceTiersAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetPriceTiersAction)
                .isInstanceOf(StandalonePriceSetPriceTiersAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceSetPriceTiersAction.builder()
                .tiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl())) } };
    }

    @Test
    public void tiers() {
        StandalonePriceSetPriceTiersAction value = StandalonePriceSetPriceTiersAction.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
    }
}
