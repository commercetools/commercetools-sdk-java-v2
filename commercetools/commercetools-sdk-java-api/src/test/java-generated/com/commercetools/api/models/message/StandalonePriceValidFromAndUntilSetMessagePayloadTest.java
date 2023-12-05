
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
public class StandalonePriceValidFromAndUntilSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceValidFromAndUntilSetMessagePayloadBuilder builder) {
        StandalonePriceValidFromAndUntilSetMessagePayload standalonePriceValidFromAndUntilSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(standalonePriceValidFromAndUntilSetMessagePayload)
                .isInstanceOf(StandalonePriceValidFromAndUntilSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceValidFromAndUntilSetMessagePayload.builder()
                        .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePriceValidFromAndUntilSetMessagePayload.builder()
                        .previousValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePriceValidFromAndUntilSetMessagePayload.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePriceValidFromAndUntilSetMessagePayload.builder()
                        .previousValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        StandalonePriceValidFromAndUntilSetMessagePayload value = StandalonePriceValidFromAndUntilSetMessagePayload
                .of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void previousValidFrom() {
        StandalonePriceValidFromAndUntilSetMessagePayload value = StandalonePriceValidFromAndUntilSetMessagePayload
                .of();
        value.setPreviousValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getPreviousValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        StandalonePriceValidFromAndUntilSetMessagePayload value = StandalonePriceValidFromAndUntilSetMessagePayload
                .of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void previousValidUntil() {
        StandalonePriceValidFromAndUntilSetMessagePayload value = StandalonePriceValidFromAndUntilSetMessagePayload
                .of();
        value.setPreviousValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getPreviousValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
