
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAssetSourcesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAssetSourcesActionBuilder builder) {
        VariantSetAssetSourcesAction variantSetAssetSourcesAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAssetSourcesAction).isInstanceOf(VariantSetAssetSourcesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantSetAssetSourcesAction.builder().staged(true) },
                new Object[] { "assetId", VariantSetAssetSourcesAction.builder().assetId("assetId") },
                new Object[] { "assetKey", VariantSetAssetSourcesAction.builder().assetKey("assetKey") },
                new Object[] { "sources", VariantSetAssetSourcesAction.builder()
                        .sources(
                            Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl())) } };
    }

    @Test
    public void staged() {
        VariantSetAssetSourcesAction value = VariantSetAssetSourcesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        VariantSetAssetSourcesAction value = VariantSetAssetSourcesAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        VariantSetAssetSourcesAction value = VariantSetAssetSourcesAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void sources() {
        VariantSetAssetSourcesAction value = VariantSetAssetSourcesAction.of();
        value.setSources(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
        Assertions.assertThat(value.getSources())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
    }
}
