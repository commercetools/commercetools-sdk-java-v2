
package com.commercetools.api.models.message;

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
public class StoreCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreCreatedMessagePayloadBuilder builder) {
        StoreCreatedMessagePayload storeCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeCreatedMessagePayload).isInstanceOf(StoreCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreCreatedMessagePayload.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { StoreCreatedMessagePayload.builder().languages(Collections.singletonList("languages")) },
                new Object[] { StoreCreatedMessagePayload.builder()
                        .countries(Collections
                                .singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { StoreCreatedMessagePayload.builder()
                        .distributionChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { StoreCreatedMessagePayload.builder()
                        .supplyChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { StoreCreatedMessagePayload.builder()
                        .productSelections(Collections
                                .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { StoreCreatedMessagePayload.builder()
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
