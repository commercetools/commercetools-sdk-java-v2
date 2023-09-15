
package com.commercetools.importapi.models.standalone_prices;

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
public class StandalonePriceImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceImportBuilder builder) {
        StandalonePriceImport standalonePriceImport = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceImport).isInstanceOf(StandalonePriceImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceImport.builder().key("key") },
                new Object[] { StandalonePriceImport.builder().sku("sku") },
                new Object[] { StandalonePriceImport.builder()
                        .value(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { StandalonePriceImport.builder().country("country") },
                new Object[] { StandalonePriceImport.builder()
                        .customerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl()) },
                new Object[] { StandalonePriceImport.builder()
                        .channel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl()) },
                new Object[] { StandalonePriceImport.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePriceImport.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        StandalonePriceImport.builder()
                                .tiers(Collections.singletonList(
                                    new com.commercetools.importapi.models.common.PriceTierImpl())) },
                new Object[] { StandalonePriceImport.builder()
                        .discounted(new com.commercetools.importapi.models.common.DiscountedPriceImpl()) },
                new Object[] { StandalonePriceImport.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void key() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void value() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setValue(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void country() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void customerGroup() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setCustomerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
    }

    @Test
    public void channel() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
    }

    @Test
    public void validFrom() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void tiers() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setTiers(Collections.singletonList(new com.commercetools.importapi.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.PriceTierImpl()));
    }

    @Test
    public void discounted() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setDiscounted(new com.commercetools.importapi.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.importapi.models.common.DiscountedPriceImpl());
    }

    @Test
    public void custom() {
        StandalonePriceImport value = StandalonePriceImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
