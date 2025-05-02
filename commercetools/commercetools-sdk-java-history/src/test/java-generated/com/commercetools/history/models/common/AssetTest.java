
package com.commercetools.history.models.common;

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
        return new Object[][] { new Object[] { "id", Asset.builder().id("id") },
                new Object[] { "name",
                        Asset.builder().name(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        Asset.builder()
                                .description(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "custom",
                        Asset.builder().custom(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "key", Asset.builder().key("key") } };
    }

    @Test
    public void id() {
        Asset value = Asset.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        Asset value = Asset.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        Asset value = Asset.of();
        value.setDescription(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void custom() {
        Asset value = Asset.of();
        value.setCustom(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void key() {
        Asset value = Asset.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
