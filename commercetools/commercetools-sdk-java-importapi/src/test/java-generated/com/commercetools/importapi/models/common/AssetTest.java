
package com.commercetools.importapi.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssetBuilder builder) {
        Asset asset = builder.buildUnchecked();
        Assertions.assertThat(asset).isInstanceOf(Asset.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", Asset.builder().key("key") },
                new Object[] { "sources",
                        Asset.builder()
                                .sources(Collections.singletonList(
                                    new com.commercetools.importapi.models.common.AssetSourceImpl())) },
                new Object[] { "name",
                        Asset.builder().name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        Asset.builder()
                                .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "tags", Asset.builder().tags(Collections.singletonList("tags")) },
                new Object[] { "custom",
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
