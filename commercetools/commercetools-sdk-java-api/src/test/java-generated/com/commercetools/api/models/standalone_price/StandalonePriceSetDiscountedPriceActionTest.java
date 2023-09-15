
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
public class StandalonePriceSetDiscountedPriceActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceSetDiscountedPriceActionBuilder builder) {
        StandalonePriceSetDiscountedPriceAction standalonePriceSetDiscountedPriceAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetDiscountedPriceAction)
                .isInstanceOf(StandalonePriceSetDiscountedPriceAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceSetDiscountedPriceAction.builder()
                .discounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl()) } };
    }

    @Test
    public void discounted() {
        StandalonePriceSetDiscountedPriceAction value = StandalonePriceSetDiscountedPriceAction.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
    }
}
