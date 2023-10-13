
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
public class StandalonePriceActiveChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceActiveChangedMessagePayloadBuilder builder) {
        StandalonePriceActiveChangedMessagePayload standalonePriceActiveChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(standalonePriceActiveChangedMessagePayload)
                .isInstanceOf(StandalonePriceActiveChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceActiveChangedMessagePayload.builder().active(true) },
                new Object[] { StandalonePriceActiveChangedMessagePayload.builder().oldActive(true) } };
    }

    @Test
    public void active() {
        StandalonePriceActiveChangedMessagePayload value = StandalonePriceActiveChangedMessagePayload.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }

    @Test
    public void oldActive() {
        StandalonePriceActiveChangedMessagePayload value = StandalonePriceActiveChangedMessagePayload.of();
        value.setOldActive(true);
        Assertions.assertThat(value.getOldActive()).isEqualTo(true);
    }
}
