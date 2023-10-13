
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
public class StandalonePriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceBuilder builder) {
        StandalonePrice standalonePrice = builder.buildUnchecked();
        Assertions.assertThat(standalonePrice).isInstanceOf(StandalonePrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePrice.builder().id("id") },
                new Object[] { StandalonePrice.builder().version(2L) },
                new Object[] { StandalonePrice.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePrice.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePrice.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        StandalonePrice.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { StandalonePrice.builder().key("key") },
                new Object[] { StandalonePrice.builder().sku("sku") },
                new Object[] {
                        StandalonePrice.builder().value(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { StandalonePrice.builder().country("country") },
                new Object[] { StandalonePrice.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { StandalonePrice.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) },
                new Object[] { StandalonePrice.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePrice.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePrice.builder()
                        .tiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl())) },
                new Object[] { StandalonePrice.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) },
                new Object[] {
                        StandalonePrice.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { StandalonePrice.builder()
                        .staged(new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl()) },
                new Object[] { StandalonePrice.builder().active(true) } };
    }

    @Test
    public void id() {
        StandalonePrice value = StandalonePrice.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        StandalonePrice value = StandalonePrice.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        StandalonePrice value = StandalonePrice.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        StandalonePrice value = StandalonePrice.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        StandalonePrice value = StandalonePrice.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        StandalonePrice value = StandalonePrice.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        StandalonePrice value = StandalonePrice.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        StandalonePrice value = StandalonePrice.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void value() {
        StandalonePrice value = StandalonePrice.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void country() {
        StandalonePrice value = StandalonePrice.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        StandalonePrice value = StandalonePrice.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void channel() {
        StandalonePrice value = StandalonePrice.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }

    @Test
    public void validFrom() {
        StandalonePrice value = StandalonePrice.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        StandalonePrice value = StandalonePrice.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void tiers() {
        StandalonePrice value = StandalonePrice.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }

    @Test
    public void discounted() {
        StandalonePrice value = StandalonePrice.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }

    @Test
    public void custom() {
        StandalonePrice value = StandalonePrice.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void staged() {
        StandalonePrice value = StandalonePrice.of();
        value.setStaged(new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl());
        Assertions.assertThat(value.getStaged())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl());
    }

    @Test
    public void active() {
        StandalonePrice value = StandalonePrice.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
