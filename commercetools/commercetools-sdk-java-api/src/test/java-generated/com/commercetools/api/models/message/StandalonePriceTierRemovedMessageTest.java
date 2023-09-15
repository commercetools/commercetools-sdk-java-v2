
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
public class StandalonePriceTierRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceTierRemovedMessageBuilder builder) {
        StandalonePriceTierRemovedMessage standalonePriceTierRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTierRemovedMessage).isInstanceOf(StandalonePriceTierRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceTierRemovedMessage.builder()
                .removedTier(new com.commercetools.api.models.common.PriceTierImpl()) } };
    }

    @Test
    public void removedTier() {
        StandalonePriceTierRemovedMessage value = StandalonePriceTierRemovedMessage.of();
        value.setRemovedTier(new com.commercetools.api.models.common.PriceTierImpl());
        Assertions.assertThat(value.getRemovedTier())
                .isEqualTo(new com.commercetools.api.models.common.PriceTierImpl());
    }
}
