
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
public class StandalonePriceTierAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceTierAddedMessagePayloadBuilder builder) {
        StandalonePriceTierAddedMessagePayload standalonePriceTierAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTierAddedMessagePayload)
                .isInstanceOf(StandalonePriceTierAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceTierAddedMessagePayload.builder()
                .tier(new com.commercetools.api.models.common.PriceTierImpl()) } };
    }

    @Test
    public void tier() {
        StandalonePriceTierAddedMessagePayload value = StandalonePriceTierAddedMessagePayload.of();
        value.setTier(new com.commercetools.api.models.common.PriceTierImpl());
        Assertions.assertThat(value.getTier()).isEqualTo(new com.commercetools.api.models.common.PriceTierImpl());
    }
}
