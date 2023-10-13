
package com.commercetools.api.models.standalone_price;

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
public class StandalonePriceDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceDraftBuilder builder) {
        StandalonePriceDraft standalonePriceDraft = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceDraft).isInstanceOf(StandalonePriceDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceDraft.builder().key("key") },
                new Object[] { StandalonePriceDraft.builder().sku("sku") },
                new Object[] {
                        StandalonePriceDraft.builder().value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { StandalonePriceDraft.builder().country("country") },
                new Object[] { StandalonePriceDraft.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { StandalonePriceDraft.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { StandalonePriceDraft.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePriceDraft.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        StandalonePriceDraft.builder()
                                .tiers(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl())) },
                new Object[] { StandalonePriceDraft.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl()) },
                new Object[] { StandalonePriceDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { StandalonePriceDraft.builder()
                        .staged(new com.commercetools.api.models.standalone_price.StagedPriceDraftImpl()) },
                new Object[] { StandalonePriceDraft.builder().active(true) } };
    }

    @Test
    public void key() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void value() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void country() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void channel() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void validFrom() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void tiers() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
    }

    @Test
    public void discounted() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
    }

    @Test
    public void custom() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void staged() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setStaged(new com.commercetools.api.models.standalone_price.StagedPriceDraftImpl());
        Assertions.assertThat(value.getStaged())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StagedPriceDraftImpl());
    }

    @Test
    public void active() {
        StandalonePriceDraft value = StandalonePriceDraft.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
