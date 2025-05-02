
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicateStandalonePriceScopeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicateStandalonePriceScopeErrorBuilder builder) {
        GraphQLDuplicateStandalonePriceScopeError graphQLDuplicateStandalonePriceScopeError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateStandalonePriceScopeError)
                .isInstanceOf(GraphQLDuplicateStandalonePriceScopeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "conflictingStandalonePrice",
                        GraphQLDuplicateStandalonePriceScopeError.builder()
                                .conflictingStandalonePrice(
                                    new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl()) },
                new Object[] { "sku", GraphQLDuplicateStandalonePriceScopeError.builder().sku("sku") },
                new Object[] { "currency", GraphQLDuplicateStandalonePriceScopeError.builder().currency("currency") },
                new Object[] { "country", GraphQLDuplicateStandalonePriceScopeError.builder().country("country") },
                new Object[] { "customerGroup", GraphQLDuplicateStandalonePriceScopeError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        GraphQLDuplicateStandalonePriceScopeError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "validFrom",
                        GraphQLDuplicateStandalonePriceScopeError.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil", GraphQLDuplicateStandalonePriceScopeError.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void conflictingStandalonePrice() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setConflictingStandalonePrice(
            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
        Assertions.assertThat(value.getConflictingStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
    }

    @Test
    public void sku() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        GraphQLDuplicateStandalonePriceScopeError value = GraphQLDuplicateStandalonePriceScopeError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
