
package com.commercetools.api.models.product;

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
public class ProductSetAssetSourcesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetAssetSourcesActionBuilder builder) {
        ProductSetAssetSourcesAction productSetAssetSourcesAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetSourcesAction).isInstanceOf(ProductSetAssetSourcesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetAssetSourcesAction.builder().variantId(5L) },
                new Object[] { ProductSetAssetSourcesAction.builder().sku("sku") },
                new Object[] { ProductSetAssetSourcesAction.builder().staged(true) },
                new Object[] { ProductSetAssetSourcesAction.builder().assetId("assetId") },
                new Object[] { ProductSetAssetSourcesAction.builder().assetKey("assetKey") },
                new Object[] { ProductSetAssetSourcesAction.builder()
                        .sources(
                            Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl())) } };
    }

    @Test
    public void variantId() {
        ProductSetAssetSourcesAction value = ProductSetAssetSourcesAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetAssetSourcesAction value = ProductSetAssetSourcesAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductSetAssetSourcesAction value = ProductSetAssetSourcesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductSetAssetSourcesAction value = ProductSetAssetSourcesAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductSetAssetSourcesAction value = ProductSetAssetSourcesAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void sources() {
        ProductSetAssetSourcesAction value = ProductSetAssetSourcesAction.of();
        value.setSources(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
        Assertions.assertThat(value.getSources())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
    }
}
