
package com.commercetools.importapi.models.prices;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceImportBuilder builder) {
        PriceImport priceImport = builder.buildUnchecked();
        Assertions.assertThat(priceImport).isInstanceOf(PriceImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PriceImport.builder().key("key") },
                new Object[] { "value",
                        PriceImport.builder().value(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { "country", PriceImport.builder().country("country") },
                new Object[] { "validFrom", PriceImport.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        PriceImport.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "customerGroup", PriceImport.builder()
                        .customerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl()) },
                new Object[] { "channel",
                        PriceImport.builder()
                                .channel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl()) },
                new Object[] { "discounted",
                        PriceImport.builder()
                                .discounted(new com.commercetools.importapi.models.common.DiscountedPriceImpl()) },
                new Object[] { "staged", PriceImport.builder().staged(true) },
                new Object[] { "tiers",
                        PriceImport.builder()
                                .tiers(Collections.singletonList(
                                    new com.commercetools.importapi.models.common.PriceTierImpl())) },
                new Object[] { "custom",
                        PriceImport.builder()
                                .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) },
                new Object[] { "productVariant",
                        PriceImport.builder()
                                .productVariant(
                                    new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl()) },
                new Object[] { "product", PriceImport.builder()
                        .product(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl()) } };
    }

    @Test
    public void key() {
        PriceImport value = PriceImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void value() {
        PriceImport value = PriceImport.of();
        value.setValue(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void country() {
        PriceImport value = PriceImport.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void validFrom() {
        PriceImport value = PriceImport.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        PriceImport value = PriceImport.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void customerGroup() {
        PriceImport value = PriceImport.of();
        value.setCustomerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
    }

    @Test
    public void channel() {
        PriceImport value = PriceImport.of();
        value.setChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
    }

    @Test
    public void discounted() {
        PriceImport value = PriceImport.of();
        value.setDiscounted(new com.commercetools.importapi.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.importapi.models.common.DiscountedPriceImpl());
    }

    @Test
    public void staged() {
        PriceImport value = PriceImport.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void tiers() {
        PriceImport value = PriceImport.of();
        value.setTiers(Collections.singletonList(new com.commercetools.importapi.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.PriceTierImpl()));
    }

    @Test
    public void custom() {
        PriceImport value = PriceImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }

    @Test
    public void productVariant() {
        PriceImport value = PriceImport.of();
        value.setProductVariant(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl());
        Assertions.assertThat(value.getProductVariant())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl());
    }

    @Test
    public void product() {
        PriceImport value = PriceImport.of();
        value.setProduct(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
    }
}
