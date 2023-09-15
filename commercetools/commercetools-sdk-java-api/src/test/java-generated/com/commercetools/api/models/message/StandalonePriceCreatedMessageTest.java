
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
public class StandalonePriceCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceCreatedMessageBuilder builder) {
        StandalonePriceCreatedMessage standalonePriceCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceCreatedMessage).isInstanceOf(StandalonePriceCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceCreatedMessage.builder()
                .standalonePrice(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()) } };
    }

    @Test
    public void standalonePrice() {
        StandalonePriceCreatedMessage value = StandalonePriceCreatedMessage.of();
        value.setStandalonePrice(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
        Assertions.assertThat(value.getStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
    }
}
