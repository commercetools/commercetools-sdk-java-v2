
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssetSourceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssetSourceBuilder builder) {
        AssetSource assetSource = builder.buildUnchecked();
        Assertions.assertThat(assetSource).isInstanceOf(AssetSource.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "uri", AssetSource.builder().uri("uri") },
                new Object[] { "key", AssetSource.builder().key("key") },
                new Object[] { "dimensions",
                        AssetSource.builder()
                                .dimensions(new com.commercetools.api.models.common.AssetDimensionsImpl()) },
                new Object[] { "contentType", AssetSource.builder().contentType("contentType") } };
    }

    @Test
    public void uri() {
        AssetSource value = AssetSource.of();
        value.setUri("uri");
        Assertions.assertThat(value.getUri()).isEqualTo("uri");
    }

    @Test
    public void key() {
        AssetSource value = AssetSource.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void dimensions() {
        AssetSource value = AssetSource.of();
        value.setDimensions(new com.commercetools.api.models.common.AssetDimensionsImpl());
        Assertions.assertThat(value.getDimensions())
                .isEqualTo(new com.commercetools.api.models.common.AssetDimensionsImpl());
    }

    @Test
    public void contentType() {
        AssetSource value = AssetSource.of();
        value.setContentType("contentType");
        Assertions.assertThat(value.getContentType()).isEqualTo("contentType");
    }
}
