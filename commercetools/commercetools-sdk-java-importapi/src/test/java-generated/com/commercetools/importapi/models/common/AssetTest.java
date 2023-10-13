
package com.commercetools.importapi.models.common;

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
public class AssetTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssetBuilder builder) {
        Asset asset = builder.buildUnchecked();
        Assertions.assertThat(asset).isInstanceOf(Asset.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Asset.builder().key("key") },
                new Object[] { Asset.builder()
                        .sources(Collections
                                .singletonList(new com.commercetools.importapi.models.common.AssetSourceImpl())) },
                new Object[] {
                        Asset.builder().name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { Asset.builder()
                        .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { Asset.builder().tags(Collections.singletonList("tags")) }, new Object[] {
                        Asset.builder().custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void key() {
        Asset value = Asset.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sources() {
        Asset value = Asset.of();
        value.setSources(Collections.singletonList(new com.commercetools.importapi.models.common.AssetSourceImpl()));
        Assertions.assertThat(value.getSources())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AssetSourceImpl()));
    }

    @Test
    public void name() {
        Asset value = Asset.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        Asset value = Asset.of();
        value.setDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void tags() {
        Asset value = Asset.of();
        value.setTags(Collections.singletonList("tags"));
        Assertions.assertThat(value.getTags()).isEqualTo(Collections.singletonList("tags"));
    }

    @Test
    public void custom() {
        Asset value = Asset.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
