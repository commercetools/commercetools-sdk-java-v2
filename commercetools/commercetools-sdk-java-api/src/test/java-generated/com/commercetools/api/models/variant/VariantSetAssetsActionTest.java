
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAssetsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAssetsActionBuilder builder) {
        VariantSetAssetsAction variantSetAssetsAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAssetsAction).isInstanceOf(VariantSetAssetsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "assets",
                        VariantSetAssetsAction.builder()
                                .assets(Collections
                                        .singletonList(new com.commercetools.api.models.common.AssetDraftImpl())) },
                new Object[] { "staged", VariantSetAssetsAction.builder().staged(true) } };
    }

    @Test
    public void assets() {
        VariantSetAssetsAction value = VariantSetAssetsAction.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
    }

    @Test
    public void staged() {
        VariantSetAssetsAction value = VariantSetAssetsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
