
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
public class StandalonePriceKeySetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceKeySetMessagePayloadBuilder builder) {
        StandalonePriceKeySetMessagePayload standalonePriceKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceKeySetMessagePayload)
                .isInstanceOf(StandalonePriceKeySetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceKeySetMessagePayload.builder().key("key") },
                new Object[] { StandalonePriceKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        StandalonePriceKeySetMessagePayload value = StandalonePriceKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        StandalonePriceKeySetMessagePayload value = StandalonePriceKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
