
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLExactLockConflictErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLExactLockConflictErrorBuilder builder) {
        GraphQLExactLockConflictError graphQLExactLockConflictError = builder.buildUnchecked();
        Assertions.assertThat(graphQLExactLockConflictError).isInstanceOf(GraphQLExactLockConflictError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", GraphQLExactLockConflictError.builder().sku("sku") },
                new Object[] { "currency", GraphQLExactLockConflictError.builder().currency("currency") },
                new Object[] { "country", GraphQLExactLockConflictError.builder().country("country") },
                new Object[] { "customerGroup", GraphQLExactLockConflictError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        GraphQLExactLockConflictError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "validFrom",
                        GraphQLExactLockConflictError.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        GraphQLExactLockConflictError.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "recurrencePolicy", GraphQLExactLockConflictError.builder()
                        .recurrencePolicy(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl()) } };
    }

    @Test
    public void sku() {
        GraphQLExactLockConflictError value = GraphQLExactLockConflictError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        GraphQLExactLockConflictError value = GraphQLExactLockConflictError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        GraphQLExactLockConflictError value = GraphQLExactLockConflictError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        GraphQLExactLockConflictError value = GraphQLExactLockConflictError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        GraphQLExactLockConflictError value = GraphQLExactLockConflictError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        GraphQLExactLockConflictError value = GraphQLExactLockConflictError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        GraphQLExactLockConflictError value = GraphQLExactLockConflictError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void recurrencePolicy() {
        GraphQLExactLockConflictError value = GraphQLExactLockConflictError.of();
        value.setRecurrencePolicy(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl());
    }
}
