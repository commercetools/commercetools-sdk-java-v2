
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
public class StandalonePriceTiersSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceTiersSetMessageBuilder builder) {
        StandalonePriceTiersSetMessage standalonePriceTiersSetMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTiersSetMessage).isInstanceOf(StandalonePriceTiersSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceTiersSetMessage.builder()
                        .tiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl())) },
                new Object[] { StandalonePriceTiersSetMessage.builder()
                        .previousTiers(
                            Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl())) } };
    }

    @Test
    public void tiers() {
        StandalonePriceTiersSetMessage value = StandalonePriceTiersSetMessage.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }

    @Test
    public void previousTiers() {
        StandalonePriceTiersSetMessage value = StandalonePriceTiersSetMessage.of();
        value.setPreviousTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getPreviousTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }
}
