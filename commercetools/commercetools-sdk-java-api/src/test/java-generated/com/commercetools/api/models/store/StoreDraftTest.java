
package com.commercetools.api.models.store;

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
public class StoreDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreDraftBuilder builder) {
        StoreDraft storeDraft = builder.buildUnchecked();
        Assertions.assertThat(storeDraft).isInstanceOf(StoreDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreDraft.builder().key("key") },
                new Object[] {
                        StoreDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { StoreDraft.builder().languages(Collections.singletonList("languages")) },
                new Object[] { StoreDraft.builder()
                        .countries(Collections
                                .singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { StoreDraft.builder()
                        .distributionChannels(Collections.singletonList(
                            new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl())) },
                new Object[] { StoreDraft.builder()
                        .supplyChannels(Collections.singletonList(
                            new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl())) },
                new Object[] { StoreDraft.builder()
                        .productSelections(Collections.singletonList(
                            new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl())) },
                new Object[] {
                        StoreDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        StoreDraft value = StoreDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        StoreDraft value = StoreDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void languages() {
        StoreDraft value = StoreDraft.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }

    @Test
    public void countries() {
        StoreDraft value = StoreDraft.of();
        value.setCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }

    @Test
    public void distributionChannels() {
        StoreDraft value = StoreDraft.of();
        value.setDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()));
        Assertions.assertThat(value.getDistributionChannels())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()));
    }

    @Test
    public void supplyChannels() {
        StoreDraft value = StoreDraft.of();
        value.setSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()));
        Assertions.assertThat(value.getSupplyChannels())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()));
    }

    @Test
    public void productSelections() {
        StoreDraft value = StoreDraft.of();
        value.setProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl()));
        Assertions.assertThat(value.getProductSelections())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl()));
    }

    @Test
    public void custom() {
        StoreDraft value = StoreDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
