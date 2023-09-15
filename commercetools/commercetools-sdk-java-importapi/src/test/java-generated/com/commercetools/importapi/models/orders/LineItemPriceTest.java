
package com.commercetools.importapi.models.orders;

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
public class LineItemPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LineItemPriceBuilder builder) {
        LineItemPrice lineItemPrice = builder.buildUnchecked();
        Assertions.assertThat(lineItemPrice).isInstanceOf(LineItemPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        LineItemPrice.builder().value(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { LineItemPrice.builder().country("country") },
                new Object[] { LineItemPrice.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { LineItemPrice.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { LineItemPrice.builder()
                        .customerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl()) },
                new Object[] { LineItemPrice.builder()
                        .channel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl()) },
                new Object[] { LineItemPrice.builder()
                        .discounted(new com.commercetools.importapi.models.common.DiscountedPriceImpl()) },
                new Object[] {
                        LineItemPrice.builder()
                                .tiers(Collections.singletonList(
                                    new com.commercetools.importapi.models.common.PriceTierImpl())) },
                new Object[] { LineItemPrice.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void value() {
        LineItemPrice value = LineItemPrice.of();
        value.setValue(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void country() {
        LineItemPrice value = LineItemPrice.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void validFrom() {
        LineItemPrice value = LineItemPrice.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        LineItemPrice value = LineItemPrice.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void customerGroup() {
        LineItemPrice value = LineItemPrice.of();
        value.setCustomerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
    }

    @Test
    public void channel() {
        LineItemPrice value = LineItemPrice.of();
        value.setChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
    }

    @Test
    public void discounted() {
        LineItemPrice value = LineItemPrice.of();
        value.setDiscounted(new com.commercetools.importapi.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.importapi.models.common.DiscountedPriceImpl());
    }

    @Test
    public void tiers() {
        LineItemPrice value = LineItemPrice.of();
        value.setTiers(Collections.singletonList(new com.commercetools.importapi.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.PriceTierImpl()));
    }

    @Test
    public void custom() {
        LineItemPrice value = LineItemPrice.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
