
package com.commercetools.api.models.common;

import java.time.ZonedDateTime;

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
public class ScopedPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ScopedPriceBuilder builder) {
        ScopedPrice scopedPrice = builder.buildUnchecked();
        Assertions.assertThat(scopedPrice).isInstanceOf(ScopedPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ScopedPrice.builder().id("id") },
                new Object[] { ScopedPrice.builder().value(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] {
                        ScopedPrice.builder().currentValue(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { ScopedPrice.builder().country("country") },
                new Object[] { ScopedPrice.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { ScopedPrice.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) },
                new Object[] { ScopedPrice.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ScopedPrice.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ScopedPrice.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) },
                new Object[] {
                        ScopedPrice.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        ScopedPrice value = ScopedPrice.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void value() {
        ScopedPrice value = ScopedPrice.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void currentValue() {
        ScopedPrice value = ScopedPrice.of();
        value.setCurrentValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getCurrentValue())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void country() {
        ScopedPrice value = ScopedPrice.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        ScopedPrice value = ScopedPrice.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void channel() {
        ScopedPrice value = ScopedPrice.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }

    @Test
    public void validFrom() {
        ScopedPrice value = ScopedPrice.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        ScopedPrice value = ScopedPrice.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void discounted() {
        ScopedPrice value = ScopedPrice.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }

    @Test
    public void custom() {
        ScopedPrice value = ScopedPrice.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
