
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
public class StandalonePriceStagedChangesAppliedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceStagedChangesAppliedMessagePayloadBuilder builder) {
        StandalonePriceStagedChangesAppliedMessagePayload standalonePriceStagedChangesAppliedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(standalonePriceStagedChangesAppliedMessagePayload)
                .isInstanceOf(StandalonePriceStagedChangesAppliedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceStagedChangesAppliedMessagePayload.builder()
                .stagedChanges(new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl()) } };
    }

    @Test
    public void stagedChanges() {
        StandalonePriceStagedChangesAppliedMessagePayload value = StandalonePriceStagedChangesAppliedMessagePayload
                .of();
        value.setStagedChanges(new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl());
        Assertions.assertThat(value.getStagedChanges())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl());
    }
}
