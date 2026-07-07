
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantRemoveAssetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantRemoveAssetActionBuilder builder) {
        VariantRemoveAssetAction variantRemoveAssetAction = builder.buildUnchecked();
        Assertions.assertThat(variantRemoveAssetAction).isInstanceOf(VariantRemoveAssetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantRemoveAssetAction.builder().staged(true) },
                new Object[] { "assetId", VariantRemoveAssetAction.builder().assetId("assetId") },
                new Object[] { "assetKey", VariantRemoveAssetAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void staged() {
        VariantRemoveAssetAction value = VariantRemoveAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        VariantRemoveAssetAction value = VariantRemoveAssetAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        VariantRemoveAssetAction value = VariantRemoveAssetAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
