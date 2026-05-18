
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidityLockConflictErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ValidityLockConflictErrorBuilder builder) {
        ValidityLockConflictError validityLockConflictError = builder.buildUnchecked();
        Assertions.assertThat(validityLockConflictError).isInstanceOf(ValidityLockConflictError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ValidityLockConflictError.builder().message("message") },
                new Object[] { "sku", ValidityLockConflictError.builder().sku("sku") },
                new Object[] { "currency", ValidityLockConflictError.builder().currency("currency") },
                new Object[] { "country", ValidityLockConflictError.builder().country("country") },
                new Object[] { "customerGroup", ValidityLockConflictError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        ValidityLockConflictError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "recurrencePolicy", ValidityLockConflictError.builder()
                        .recurrencePolicy(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl()) } };
    }

    @Test
    public void message() {
        ValidityLockConflictError value = ValidityLockConflictError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void sku() {
        ValidityLockConflictError value = ValidityLockConflictError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        ValidityLockConflictError value = ValidityLockConflictError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        ValidityLockConflictError value = ValidityLockConflictError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        ValidityLockConflictError value = ValidityLockConflictError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        ValidityLockConflictError value = ValidityLockConflictError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void recurrencePolicy() {
        ValidityLockConflictError value = ValidityLockConflictError.of();
        value.setRecurrencePolicy(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
    }
}
