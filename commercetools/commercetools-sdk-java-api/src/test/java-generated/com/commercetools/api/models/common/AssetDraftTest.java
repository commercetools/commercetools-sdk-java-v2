
package com.commercetools.api.models.common;

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
public class AssetDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssetDraftBuilder builder) {
        AssetDraft assetDraft = builder.buildUnchecked();
        Assertions.assertThat(assetDraft).isInstanceOf(AssetDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        AssetDraft.builder()
                                .sources(Collections
                                        .singletonList(new com.commercetools.api.models.common.AssetSourceImpl())) },
                new Object[] {
                        AssetDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { AssetDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { AssetDraft.builder().tags(Collections.singletonList("tags")) },
                new Object[] {
                        AssetDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { AssetDraft.builder().key("key") } };
    }

    @Test
    public void sources() {
        AssetDraft value = AssetDraft.of();
        value.setSources(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
        Assertions.assertThat(value.getSources())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
    }

    @Test
    public void name() {
        AssetDraft value = AssetDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        AssetDraft value = AssetDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void tags() {
        AssetDraft value = AssetDraft.of();
        value.setTags(Collections.singletonList("tags"));
        Assertions.assertThat(value.getTags()).isEqualTo(Collections.singletonList("tags"));
    }

    @Test
    public void custom() {
        AssetDraft value = AssetDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void key() {
        AssetDraft value = AssetDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
