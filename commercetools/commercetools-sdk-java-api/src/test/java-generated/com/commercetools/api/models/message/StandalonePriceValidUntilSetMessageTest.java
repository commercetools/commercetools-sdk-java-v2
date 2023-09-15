
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

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
public class StandalonePriceValidUntilSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceValidUntilSetMessageBuilder builder) {
        StandalonePriceValidUntilSetMessage standalonePriceValidUntilSetMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceValidUntilSetMessage)
                .isInstanceOf(StandalonePriceValidUntilSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceValidUntilSetMessage.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePriceValidUntilSetMessage.builder()
                        .previousValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validUntil() {
        StandalonePriceValidUntilSetMessage value = StandalonePriceValidUntilSetMessage.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void previousValidUntil() {
        StandalonePriceValidUntilSetMessage value = StandalonePriceValidUntilSetMessage.of();
        value.setPreviousValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getPreviousValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
