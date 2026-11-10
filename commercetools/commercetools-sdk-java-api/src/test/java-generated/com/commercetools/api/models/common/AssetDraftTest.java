
package com.commercetools.api.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssetDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssetDraftBuilder builder) {
        AssetDraft assetDraft = builder.buildUnchecked();
        Assertions.assertThat(assetDraft).isInstanceOf(AssetDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "sources",
                        AssetDraft.builder()
                                .sources(Collections
                                        .singletonList(new com.commercetools.api.models.common.AssetSourceImpl())) },
                new Object[] { "name",
                        AssetDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        AssetDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "tags", AssetDraft.builder().tags(Collections.singletonList("tags")) },
                new Object[] { "custom",
                        AssetDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "key", AssetDraft.builder().key("key") } };
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
