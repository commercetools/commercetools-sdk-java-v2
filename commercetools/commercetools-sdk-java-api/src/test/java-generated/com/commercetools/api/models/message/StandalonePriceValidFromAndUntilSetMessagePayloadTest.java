
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceValidFromAndUntilSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceValidFromAndUntilSetMessagePayloadBuilder builder) {
        StandalonePriceValidFromAndUntilSetMessagePayload standalonePriceValidFromAndUntilSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(standalonePriceValidFromAndUntilSetMessagePayload)
                .isInstanceOf(StandalonePriceValidFromAndUntilSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "validFrom",
                        StandalonePriceValidFromAndUntilSetMessagePayload.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "previousValidFrom",
                        StandalonePriceValidFromAndUntilSetMessagePayload.builder()
                                .previousValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        StandalonePriceValidFromAndUntilSetMessagePayload.builder()
                                .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "previousValidUntil", StandalonePriceValidFromAndUntilSetMessagePayload.builder()
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
