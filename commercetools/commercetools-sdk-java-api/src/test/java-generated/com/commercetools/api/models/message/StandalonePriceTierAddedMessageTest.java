
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
public class StandalonePriceTierAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceTierAddedMessageBuilder builder) {
        StandalonePriceTierAddedMessage standalonePriceTierAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTierAddedMessage).isInstanceOf(StandalonePriceTierAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceTierAddedMessage.builder()
                .tier(new com.commercetools.api.models.common.PriceTierImpl()) } };
    }

    @Test
    public void tier() {
        StandalonePriceTierAddedMessage value = StandalonePriceTierAddedMessage.of();
        value.setTier(new com.commercetools.api.models.common.PriceTierImpl());
        Assertions.assertThat(value.getTier()).isEqualTo(new com.commercetools.api.models.common.PriceTierImpl());
    }
}
