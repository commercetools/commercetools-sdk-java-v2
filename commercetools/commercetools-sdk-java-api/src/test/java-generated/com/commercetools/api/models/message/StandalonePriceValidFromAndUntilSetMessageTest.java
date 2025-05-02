
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceValidFromAndUntilSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceValidFromAndUntilSetMessageBuilder builder) {
        StandalonePriceValidFromAndUntilSetMessage standalonePriceValidFromAndUntilSetMessage = builder
                .buildUnchecked();
        Assertions.assertThat(standalonePriceValidFromAndUntilSetMessage)
                .isInstanceOf(StandalonePriceValidFromAndUntilSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "validFrom",
                        StandalonePriceValidFromAndUntilSetMessage.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "previousValidFrom",
                        StandalonePriceValidFromAndUntilSetMessage.builder()
                                .previousValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        StandalonePriceValidFromAndUntilSetMessage.builder()
                                .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "previousValidUntil", StandalonePriceValidFromAndUntilSetMessage.builder()
                        .previousValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        StandalonePriceValidFromAndUntilSetMessage value = StandalonePriceValidFromAndUntilSetMessage.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void previousValidFrom() {
        StandalonePriceValidFromAndUntilSetMessage value = StandalonePriceValidFromAndUntilSetMessage.of();
        value.setPreviousValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getPreviousValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        StandalonePriceValidFromAndUntilSetMessage value = StandalonePriceValidFromAndUntilSetMessage.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void previousValidUntil() {
        StandalonePriceValidFromAndUntilSetMessage value = StandalonePriceValidFromAndUntilSetMessage.of();
        value.setPreviousValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getPreviousValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
