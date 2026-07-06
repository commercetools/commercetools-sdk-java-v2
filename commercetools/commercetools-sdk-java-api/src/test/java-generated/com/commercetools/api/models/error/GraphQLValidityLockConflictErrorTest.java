
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLValidityLockConflictErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLValidityLockConflictErrorBuilder builder) {
        GraphQLValidityLockConflictError graphQLValidityLockConflictError = builder.buildUnchecked();
        Assertions.assertThat(graphQLValidityLockConflictError).isInstanceOf(GraphQLValidityLockConflictError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", GraphQLValidityLockConflictError.builder().sku("sku") },
                new Object[] { "currency", GraphQLValidityLockConflictError.builder().currency("currency") },
                new Object[] { "country", GraphQLValidityLockConflictError.builder().country("country") },
                new Object[] { "customerGroup", GraphQLValidityLockConflictError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        GraphQLValidityLockConflictError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "recurrencePolicy", GraphQLValidityLockConflictError.builder()
                        .recurrencePolicy(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl()) } };
    }

    @Test
    public void sku() {
        GraphQLValidityLockConflictError value = GraphQLValidityLockConflictError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        GraphQLValidityLockConflictError value = GraphQLValidityLockConflictError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        GraphQLValidityLockConflictError value = GraphQLValidityLockConflictError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        GraphQLValidityLockConflictError value = GraphQLValidityLockConflictError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        GraphQLValidityLockConflictError value = GraphQLValidityLockConflictError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void recurrencePolicy() {
        GraphQLValidityLockConflictError value = GraphQLValidityLockConflictError.of();
        value.setRecurrencePolicy(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
    }
}
