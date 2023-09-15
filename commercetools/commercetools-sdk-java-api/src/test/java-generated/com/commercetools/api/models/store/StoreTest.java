
package com.commercetools.api.models.store;

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
public class StoreTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreBuilder builder) {
        Store store = builder.buildUnchecked();
        Assertions.assertThat(store).isInstanceOf(Store.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Store.builder().id("id") }, new Object[] { Store.builder().version(2L) },
                new Object[] { Store.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Store.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        Store.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { Store.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { Store.builder().key("key") },
                new Object[] { Store.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { Store.builder().languages(Collections.singletonList("languages")) },
                new Object[] { Store.builder()
                        .countries(Collections
                                .singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { Store.builder()
                        .distributionChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { Store.builder()
                        .supplyChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { Store.builder()
                        .productSelections(Collections
                                .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { Store.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        Store value = Store.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Store value = Store.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Store value = Store.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Store value = Store.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Store value = Store.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Store value = Store.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        Store value = Store.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        Store value = Store.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void languages() {
        Store value = Store.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }

    @Test
    public void countries() {
        Store value = Store.of();
        value.setCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }

    @Test
    public void distributionChannels() {
        Store value = Store.of();
        value.setDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getDistributionChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void supplyChannels() {
        Store value = Store.of();
        value.setSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void productSelections() {
        Store value = Store.of();
        value.setProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }

    @Test
    public void custom() {
        Store value = Store.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
