
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicateStandalonePriceScopeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicateStandalonePriceScopeErrorBuilder builder) {
        DuplicateStandalonePriceScopeError duplicateStandalonePriceScopeError = builder.buildUnchecked();
        Assertions.assertThat(duplicateStandalonePriceScopeError)
                .isInstanceOf(DuplicateStandalonePriceScopeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", DuplicateStandalonePriceScopeError.builder().message("message") },
                new Object[] { "conflictingStandalonePrice",
                        DuplicateStandalonePriceScopeError.builder()
                                .conflictingStandalonePrice(
                                    new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl()) },
                new Object[] { "sku", DuplicateStandalonePriceScopeError.builder().sku("sku") },
                new Object[] { "currency", DuplicateStandalonePriceScopeError.builder().currency("currency") },
                new Object[] { "country", DuplicateStandalonePriceScopeError.builder().country("country") },
                new Object[] { "customerGroup", DuplicateStandalonePriceScopeError.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        DuplicateStandalonePriceScopeError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "validFrom",
                        DuplicateStandalonePriceScopeError.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil", DuplicateStandalonePriceScopeError.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void message() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingStandalonePrice() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setConflictingStandalonePrice(
            new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
        Assertions.assertThat(value.getConflictingStandalonePrice())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceReferenceImpl());
    }

    @Test
    public void sku() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void currency() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void country() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        DuplicateStandalonePriceScopeError value = DuplicateStandalonePriceScopeError.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
