
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceValidUntilSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceValidUntilSetMessagePayloadBuilder builder) {
        StandalonePriceValidUntilSetMessagePayload standalonePriceValidUntilSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(standalonePriceValidUntilSetMessagePayload)
                .isInstanceOf(StandalonePriceValidUntilSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "validUntil",
                        StandalonePriceValidUntilSetMessagePayload.builder()
                                .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "previousValidUntil", StandalonePriceValidUntilSetMessagePayload.builder()
                        .previousValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validUntil() {
        StandalonePriceValidUntilSetMessagePayload value = StandalonePriceValidUntilSetMessagePayload.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void previousValidUntil() {
        StandalonePriceValidUntilSetMessagePayload value = StandalonePriceValidUntilSetMessagePayload.of();
        value.setPreviousValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getPreviousValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
