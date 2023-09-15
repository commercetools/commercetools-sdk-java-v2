
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
public class StandalonePriceDeletedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceDeletedMessagePayloadBuilder builder) {
        StandalonePriceDeletedMessagePayload standalonePriceDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceDeletedMessagePayload)
                .isInstanceOf(StandalonePriceDeletedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceDeletedMessagePayload.builder().sku("sku") } };
    }

    @Test
    public void sku() {
        StandalonePriceDeletedMessagePayload value = StandalonePriceDeletedMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
