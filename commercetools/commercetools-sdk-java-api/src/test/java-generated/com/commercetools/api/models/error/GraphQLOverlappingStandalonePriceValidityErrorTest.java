
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLOverlappingStandalonePriceValidityErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLOverlappingStandalonePriceValidityErrorBuilder builder) {
        GraphQLOverlappingStandalonePriceValidityError graphQLOverlappingStandalonePriceValidityError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLOverlappingStandalonePriceValidityError)
                .isInstanceOf(GraphQLOverlappingStandalonePriceValidityError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "conflictingStandalonePrice",
                        GraphQLOverlappingStandalonePriceValidityError.builder()
                                .conflictingStandalonePrice(
                                    new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl()) },
                new Object[] { "sku", GraphQLOverlappingStandalonePriceValidityError.builder().sku("sku") },
                new Object[] { "currency",
                        GraphQLOverlappingStandalonePriceValidityError.builder().currency("currency") },
                new Object[] { "country", GraphQLOverlappingStandalonePriceValidityError.builder().country("country") },
                new Object[] { "customerGroup", GraphQLOverlappingStandalonePriceValidityError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        GraphQLOverlappingStandalonePriceValidityError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "validFrom",
                        GraphQLOverlappingStandalonePriceValidityError.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        GraphQLOverlappingStandalonePriceValidityError.builder()
                                .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "conflictingValidFrom",
                        GraphQLOverlappingStandalonePriceValidityError.builder()
                                .conflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "conflictingValidUntil", GraphQLOverlappingStandalonePriceValidityError.builder()
                        .conflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void conflictingStandalonePrice() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setConflictingStandalonePrice(
            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
        Assertions.assertThat(value.getConflictingStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
    }

    @Test
    public void sku() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidFrom() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setConflictingValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void conflictingValidUntil() {
        GraphQLOverlappingStandalonePriceValidityError value = GraphQLOverlappingStandalonePriceValidityError.of();
        value.setConflictingValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getConflictingValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
