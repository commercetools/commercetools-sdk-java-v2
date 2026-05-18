
package com.commercetools.history.models.common;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceBuilder builder) {
        Price price = builder.buildUnchecked();
        Assertions.assertThat(price).isInstanceOf(Price.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Price.builder().id("id") },
                new Object[] { "key", Price.builder().key("key") },
                new Object[] { "value",
                        Price.builder().value(new com.commercetools.history.models.common.TypedMoneyImpl()) },
                new Object[] { "country", Price.builder().country("country") },
                new Object[] { "customerGroup", Price.builder()
                        .customerGroup(new com.commercetools.history.models.common.CustomerGroupReferenceImpl()) },
                new Object[] { "channel",
                        Price.builder().channel(new com.commercetools.history.models.common.ChannelReferenceImpl()) },
                new Object[] { "validFrom", Price.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil", Price.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "discounted",
                        Price.builder().discounted(new com.commercetools.history.models.common.DiscountedPriceImpl()) },
                new Object[] { "tiers",
                        Price.builder()
                                .tiers(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceTierImpl())) },
                new Object[] { "custom",
                        Price.builder().custom(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "recurrencePolicy",
                        Price.builder()
                                .recurrencePolicy(
                                    new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl()) } };
    }

    @Test
    public void id() {
        Price value = Price.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        Price value = Price.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void value() {
        Price value = Price.of();
        value.setValue(new com.commercetools.history.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.history.models.common.TypedMoneyImpl());
    }

    @Test
    public void country() {
        Price value = Price.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        Price value = Price.of();
        value.setCustomerGroup(new com.commercetools.history.models.common.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.history.models.common.CustomerGroupReferenceImpl());
    }

    @Test
    public void channel() {
        Price value = Price.of();
        value.setChannel(new com.commercetools.history.models.common.ChannelReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.history.models.common.ChannelReferenceImpl());
    }

    @Test
    public void validFrom() {
        Price value = Price.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        Price value = Price.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void discounted() {
        Price value = Price.of();
        value.setDiscounted(new com.commercetools.history.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedPriceImpl());
    }

    @Test
    public void tiers() {
        Price value = Price.of();
        value.setTiers(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
    }

    @Test
    public void custom() {
        Price value = Price.of();
        value.setCustom(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void recurrencePolicy() {
        Price value = Price.of();
        value.setRecurrencePolicy(new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl());
    }
}
