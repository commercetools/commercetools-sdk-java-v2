
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAssetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAssetKeyActionBuilder builder) {
        VariantSetAssetKeyAction variantSetAssetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAssetKeyAction).isInstanceOf(VariantSetAssetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantSetAssetKeyAction.builder().staged(true) },
                new Object[] { "assetId", VariantSetAssetKeyAction.builder().assetId("assetId") },
                new Object[] { "assetKey", VariantSetAssetKeyAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void staged() {
        VariantSetAssetKeyAction value = VariantSetAssetKeyAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        VariantSetAssetKeyAction value = VariantSetAssetKeyAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        VariantSetAssetKeyAction value = VariantSetAssetKeyAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
