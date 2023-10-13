
package com.commercetools.importapi.models.common;

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
public class AssetSourceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssetSourceBuilder builder) {
        AssetSource assetSource = builder.buildUnchecked();
        Assertions.assertThat(assetSource).isInstanceOf(AssetSource.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssetSource.builder().uri("uri") },
                new Object[] { AssetSource.builder().key("key") },
                new Object[] { AssetSource.builder()
                        .dimensions(new com.commercetools.importapi.models.common.AssetDimensionsImpl()) },
                new Object[] { AssetSource.builder().contentType("contentType") } };
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
        value.setDimensions(new com.commercetools.importapi.models.common.AssetDimensionsImpl());
        Assertions.assertThat(value.getDimensions())
                .isEqualTo(new com.commercetools.importapi.models.common.AssetDimensionsImpl());
    }

    @Test
    public void contentType() {
        AssetSource value = AssetSource.of();
        value.setContentType("contentType");
        Assertions.assertThat(value.getContentType()).isEqualTo("contentType");
    }
}
