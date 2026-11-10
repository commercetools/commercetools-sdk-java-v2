
package com.commercetools.api.models.common;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QueryPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QueryPriceBuilder builder) {
        QueryPrice queryPrice = builder.buildUnchecked();
        Assertions.assertThat(queryPrice).isInstanceOf(QueryPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", QueryPrice.builder().id("id") },
                new Object[] { "value",
                        QueryPrice.builder().value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "country", QueryPrice.builder().country("country") },
                new Object[] { "customerGroup", QueryPrice.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "channel",
                        QueryPrice.builder().channel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) },
                new Object[] { "validFrom", QueryPrice.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        QueryPrice.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "discounted",
                        QueryPrice.builder()
                                .discounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl()) },
                new Object[] { "custom",
                        QueryPrice.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "tiers",
                        QueryPrice.builder()
                                .tiers(Collections.singletonList(
                                    new com.commercetools.api.models.common.PriceTierDraftImpl())) } };
    }

    @Test
    public void id() {
        QueryPrice value = QueryPrice.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void value() {
        QueryPrice value = QueryPrice.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void country() {
        QueryPrice value = QueryPrice.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        QueryPrice value = QueryPrice.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void channel() {
        QueryPrice value = QueryPrice.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }

    @Test
    public void validFrom() {
        QueryPrice value = QueryPrice.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        QueryPrice value = QueryPrice.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void discounted() {
        QueryPrice value = QueryPrice.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
    }

    @Test
    public void custom() {
        QueryPrice value = QueryPrice.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void tiers() {
        QueryPrice value = QueryPrice.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
    }
}
