
package com.commercetools.api.models.common;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceDraftBuilder builder) {
        PriceDraft priceDraft = builder.buildUnchecked();
        Assertions.assertThat(priceDraft).isInstanceOf(PriceDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PriceDraft.builder().key("key") },
                new Object[] { "value",
                        PriceDraft.builder().value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "country", PriceDraft.builder().country("country") },
                new Object[] { "customerGroup", PriceDraft.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "channel",
                        PriceDraft.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "validFrom", PriceDraft.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        PriceDraft.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "discounted",
                        PriceDraft.builder()
                                .discounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl()) },
                new Object[] { "tiers",
                        PriceDraft.builder()
                                .tiers(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl())) },
                new Object[] { "custom",
                        PriceDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "recurrencePolicy", PriceDraft.builder()
                        .recurrencePolicy(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl()) } };
    }

    @Test
    public void key() {
        PriceDraft value = PriceDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void value() {
        PriceDraft value = PriceDraft.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void country() {
        PriceDraft value = PriceDraft.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        PriceDraft value = PriceDraft.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        PriceDraft value = PriceDraft.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        PriceDraft value = PriceDraft.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        PriceDraft value = PriceDraft.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void discounted() {
        PriceDraft value = PriceDraft.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
    }

    @Test
    public void tiers() {
        PriceDraft value = PriceDraft.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
    }

    @Test
    public void custom() {
        PriceDraft value = PriceDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void recurrencePolicy() {
        PriceDraft value = PriceDraft.of();
        value.setRecurrencePolicy(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
    }
}
