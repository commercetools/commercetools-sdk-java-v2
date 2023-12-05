
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
public class StandalonePriceCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceCreatedMessagePayloadBuilder builder) {
        StandalonePriceCreatedMessagePayload standalonePriceCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceCreatedMessagePayload)
                .isInstanceOf(StandalonePriceCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceCreatedMessagePayload.builder()
                .standalonePrice(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()) } };
    }

    @Test
    public void standalonePrice() {
        StandalonePriceCreatedMessagePayload value = StandalonePriceCreatedMessagePayload.of();
        value.setStandalonePrice(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
        Assertions.assertThat(value.getStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
    }
}
