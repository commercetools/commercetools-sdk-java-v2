
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
public class StoreCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreCreatedMessageBuilder builder) {
        StoreCreatedMessage storeCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeCreatedMessage).isInstanceOf(StoreCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreCreatedMessage.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { StoreCreatedMessage.builder().languages(Collections.singletonList("languages")) },
                new Object[] { StoreCreatedMessage.builder()
                        .countries(Collections
                                .singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { StoreCreatedMessage.builder()
                        .distributionChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { StoreCreatedMessage.builder()
                        .supplyChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { StoreCreatedMessage.builder()
                        .productSelections(Collections
                                .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { StoreCreatedMessage.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void name() {
        StoreCreatedMessage value = StoreCreatedMessage.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void languages() {
        StoreCreatedMessage value = StoreCreatedMessage.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }

    @Test
    public void countries() {
        StoreCreatedMessage value = StoreCreatedMessage.of();
        value.setCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }

    @Test
    public void distributionChannels() {
        StoreCreatedMessage value = StoreCreatedMessage.of();
        value.setDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getDistributionChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void supplyChannels() {
        StoreCreatedMessage value = StoreCreatedMessage.of();
        value.setSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void productSelections() {
        StoreCreatedMessage value = StoreCreatedMessage.of();
        value.setProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }

    @Test
    public void custom() {
        StoreCreatedMessage value = StoreCreatedMessage.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
