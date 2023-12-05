
package com.commercetools.api.models.message;

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
public class StandalonePriceTierRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceTierRemovedMessagePayloadBuilder builder) {
        StandalonePriceTierRemovedMessagePayload standalonePriceTierRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTierRemovedMessagePayload)
                .isInstanceOf(StandalonePriceTierRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceTierRemovedMessagePayload.builder()
                .removedTier(new com.commercetools.api.models.common.PriceTierImpl()) } };
    }

    @Test
    public void removedTier() {
        StandalonePriceTierRemovedMessagePayload value = StandalonePriceTierRemovedMessagePayload.of();
        value.setRemovedTier(new com.commercetools.api.models.common.PriceTierImpl());
        Assertions.assertThat(value.getRemovedTier())
                .isEqualTo(new com.commercetools.api.models.common.PriceTierImpl());
    }
}
