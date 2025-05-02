
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCreatedMessagePayloadBuilder builder) {
        StoreCreatedMessagePayload storeCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeCreatedMessagePayload).isInstanceOf(StoreCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        StoreCreatedMessagePayload.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "languages",
                        StoreCreatedMessagePayload.builder().languages(Collections.singletonList("languages")) },
                new Object[] { "countries",
                        StoreCreatedMessagePayload.builder()
                                .countries(Collections.singletonList(
                                    new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { "distributionChannels",
                        StoreCreatedMessagePayload.builder()
                                .distributionChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { "supplyChannels",
                        StoreCreatedMessagePayload.builder()
                                .supplyChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { "productSelections",
                        StoreCreatedMessagePayload.builder()
                                .productSelections(Collections.singletonList(
                                    new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { "custom", StoreCreatedMessagePayload.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void name() {
        StoreCreatedMessagePayload value = StoreCreatedMessagePayload.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void languages() {
        StoreCreatedMessagePayload value = StoreCreatedMessagePayload.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }

    @Test
    public void countries() {
        StoreCreatedMessagePayload value = StoreCreatedMessagePayload.of();
        value.setCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }

    @Test
    public void distributionChannels() {
        StoreCreatedMessagePayload value = StoreCreatedMessagePayload.of();
        value.setDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getDistributionChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void supplyChannels() {
        StoreCreatedMessagePayload value = StoreCreatedMessagePayload.of();
        value.setSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void productSelections() {
        StoreCreatedMessagePayload value = StoreCreatedMessagePayload.of();
        value.setProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }

    @Test
    public void custom() {
        StoreCreatedMessagePayload value = StoreCreatedMessagePayload.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
