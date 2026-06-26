
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantAddAssetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantAddAssetActionBuilder builder) {
        VariantAddAssetAction variantAddAssetAction = builder.buildUnchecked();
        Assertions.assertThat(variantAddAssetAction).isInstanceOf(VariantAddAssetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantAddAssetAction.builder().staged(true) },
                new Object[] { "asset",
                        VariantAddAssetAction.builder()
                                .asset(new com.commercetools.api.models.common.AssetDraftImpl()) },
                new Object[] { "position", VariantAddAssetAction.builder().position(4) } };
    }

    @Test
    public void staged() {
        VariantAddAssetAction value = VariantAddAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void asset() {
        VariantAddAssetAction value = VariantAddAssetAction.of();
        value.setAsset(new com.commercetools.api.models.common.AssetDraftImpl());
        Assertions.assertThat(value.getAsset()).isEqualTo(new com.commercetools.api.models.common.AssetDraftImpl());
    }

    @Test
    public void position() {
        VariantAddAssetAction value = VariantAddAssetAction.of();
        value.setPosition(4);
        Assertions.assertThat(value.getPosition()).isEqualTo(4);
    }
}
