
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
public class StandalonePriceAddPriceTierActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceAddPriceTierActionBuilder builder) {
        StandalonePriceAddPriceTierAction standalonePriceAddPriceTierAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceAddPriceTierAction).isInstanceOf(StandalonePriceAddPriceTierAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceAddPriceTierAction.builder()
                .tier(new com.commercetools.api.models.common.PriceTierDraftImpl()) } };
    }

    @Test
    public void tier() {
        StandalonePriceAddPriceTierAction value = StandalonePriceAddPriceTierAction.of();
        value.setTier(new com.commercetools.api.models.common.PriceTierDraftImpl());
        Assertions.assertThat(value.getTier()).isEqualTo(new com.commercetools.api.models.common.PriceTierDraftImpl());
    }
}
