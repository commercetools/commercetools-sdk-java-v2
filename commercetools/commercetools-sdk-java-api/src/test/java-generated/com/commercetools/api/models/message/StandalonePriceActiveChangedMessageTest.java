
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
public class StandalonePriceActiveChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceActiveChangedMessageBuilder builder) {
        StandalonePriceActiveChangedMessage standalonePriceActiveChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceActiveChangedMessage)
                .isInstanceOf(StandalonePriceActiveChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceActiveChangedMessage.builder().active(true) },
                new Object[] { StandalonePriceActiveChangedMessage.builder().oldActive(true) } };
    }

    @Test
    public void active() {
        StandalonePriceActiveChangedMessage value = StandalonePriceActiveChangedMessage.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }

    @Test
    public void oldActive() {
        StandalonePriceActiveChangedMessage value = StandalonePriceActiveChangedMessage.of();
        value.setOldActive(true);
        Assertions.assertThat(value.getOldActive()).isEqualTo(true);
    }
}
