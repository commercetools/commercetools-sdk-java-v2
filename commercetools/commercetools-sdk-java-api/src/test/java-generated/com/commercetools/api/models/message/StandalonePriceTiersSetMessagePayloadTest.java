
package com.commercetools.api.models.message;

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
public class StandalonePriceTiersSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceTiersSetMessagePayloadBuilder builder) {
        StandalonePriceTiersSetMessagePayload standalonePriceTiersSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTiersSetMessagePayload)
                .isInstanceOf(StandalonePriceTiersSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceTiersSetMessagePayload.builder()
                        .tiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl())) },
                new Object[] { StandalonePriceTiersSetMessagePayload.builder()
                        .previousTiers(
                            Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl())) } };
    }

    @Test
    public void tiers() {
        StandalonePriceTiersSetMessagePayload value = StandalonePriceTiersSetMessagePayload.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }

    @Test
    public void previousTiers() {
        StandalonePriceTiersSetMessagePayload value = StandalonePriceTiersSetMessagePayload.of();
        value.setPreviousTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getPreviousTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }
}
