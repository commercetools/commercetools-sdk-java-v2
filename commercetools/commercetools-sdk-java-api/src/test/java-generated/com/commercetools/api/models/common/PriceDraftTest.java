
package com.commercetools.api.models.common;

import java.time.ZonedDateTime;
import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class PriceDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PriceDraftBuilder builder) {
        PriceDraft priceDraft = builder.buildUnchecked();
        Assertions.assertThat(priceDraft).isInstanceOf(PriceDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PriceDraft.builder().key("key") },
                new Object[] { PriceDraft.builder().value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { PriceDraft.builder().country("country") },
                new Object[] { PriceDraft.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { PriceDraft.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { PriceDraft.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { PriceDraft.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { PriceDraft.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl()) },
                new Object[] {
                        PriceDraft.builder()
                                .tiers(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl())) },
                new Object[] {
                        PriceDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
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
}
