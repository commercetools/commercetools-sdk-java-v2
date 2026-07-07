
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OverlappingPriceValidityErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OverlappingPriceValidityErrorBuilder builder) {
        OverlappingPriceValidityError overlappingPriceValidityError = builder.buildUnchecked();
        Assertions.assertThat(overlappingPriceValidityError).isInstanceOf(OverlappingPriceValidityError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", OverlappingPriceValidityError.builder().message("message") },
                new Object[] { "conflictingPrice",
                        OverlappingPriceValidityError.builder().conflictingPrice("conflictingPrice") },
                new Object[] { "currency", OverlappingPriceValidityError.builder().currency("currency") },
                new Object[] { "country", OverlappingPriceValidityError.builder().country("country") },
                new Object[] { "customerGroup", OverlappingPriceValidityError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        OverlappingPriceValidityError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "validFrom",
                        OverlappingPriceValidityError.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        OverlappingPriceValidityError.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "conflictingValidFrom",
                        OverlappingPriceValidityError.builder()
                                .conflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "conflictingValidUntil", OverlappingPriceValidityError.builder()
                        .conflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void message() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingPrice() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setConflictingPrice("conflictingPrice");
        Assertions.assertThat(value.getConflictingPrice()).isEqualTo("conflictingPrice");
    }

    @Test
    public void currency() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidFrom() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setConflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidUntil() {
        OverlappingPriceValidityError value = OverlappingPriceValidityError.of();
        value.setConflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
