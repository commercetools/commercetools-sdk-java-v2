
package com.commercetools.importapi.models.productdrafts;

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
public class PriceDraftImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PriceDraftImportBuilder builder) {
        PriceDraftImport priceDraftImport = builder.buildUnchecked();
        Assertions.assertThat(priceDraftImport).isInstanceOf(PriceDraftImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PriceDraftImport.builder()
                        .value(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { PriceDraftImport.builder().country("country") },
                new Object[] { PriceDraftImport.builder()
                        .customerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl()) },
                new Object[] { PriceDraftImport.builder()
                        .channel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl()) },
                new Object[] { PriceDraftImport.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { PriceDraftImport.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { PriceDraftImport.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) },
                new Object[] { PriceDraftImport.builder()
                        .discounted(new com.commercetools.importapi.models.common.DiscountedPriceImpl()) },
                new Object[] {
                        PriceDraftImport.builder()
                                .tiers(Collections.singletonList(
                                    new com.commercetools.importapi.models.common.PriceTierImpl())) },
                new Object[] { PriceDraftImport.builder().key("key") } };
    }

    @Test
    public void value() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setValue(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void country() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setCustomerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
    }

    @Test
    public void channel() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
    }

    @Test
    public void validFrom() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }

    @Test
    public void discounted() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setDiscounted(new com.commercetools.importapi.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.importapi.models.common.DiscountedPriceImpl());
    }

    @Test
    public void tiers() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setTiers(Collections.singletonList(new com.commercetools.importapi.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.PriceTierImpl()));
    }

    @Test
    public void key() {
        PriceDraftImport value = PriceDraftImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
