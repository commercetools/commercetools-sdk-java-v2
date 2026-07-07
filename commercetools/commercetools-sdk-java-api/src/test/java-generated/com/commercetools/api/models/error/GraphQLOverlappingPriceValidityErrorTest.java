
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLOverlappingPriceValidityErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLOverlappingPriceValidityErrorBuilder builder) {
        GraphQLOverlappingPriceValidityError graphQLOverlappingPriceValidityError = builder.buildUnchecked();
        Assertions.assertThat(graphQLOverlappingPriceValidityError)
                .isInstanceOf(GraphQLOverlappingPriceValidityError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "conflictingPrice",
                        GraphQLOverlappingPriceValidityError.builder().conflictingPrice("conflictingPrice") },
                new Object[] { "currency", GraphQLOverlappingPriceValidityError.builder().currency("currency") },
                new Object[] { "country", GraphQLOverlappingPriceValidityError.builder().country("country") },
                new Object[] { "customerGroup", GraphQLOverlappingPriceValidityError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        GraphQLOverlappingPriceValidityError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "validFrom",
                        GraphQLOverlappingPriceValidityError.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        GraphQLOverlappingPriceValidityError.builder()
                                .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "conflictingValidFrom",
                        GraphQLOverlappingPriceValidityError.builder()
                                .conflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "conflictingValidUntil", GraphQLOverlappingPriceValidityError.builder()
                        .conflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void conflictingPrice() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setConflictingPrice("conflictingPrice");
        Assertions.assertThat(value.getConflictingPrice()).isEqualTo("conflictingPrice");
    }

    @Test
    public void currency() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidFrom() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setConflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidUntil() {
        GraphQLOverlappingPriceValidityError value = GraphQLOverlappingPriceValidityError.of();
        value.setConflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
