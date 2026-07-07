
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantChangeAssetOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantChangeAssetOrderActionBuilder builder) {
        VariantChangeAssetOrderAction variantChangeAssetOrderAction = builder.buildUnchecked();
        Assertions.assertThat(variantChangeAssetOrderAction).isInstanceOf(VariantChangeAssetOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantChangeAssetOrderAction.builder().staged(true) },
                new Object[] { "assetOrder",
                        VariantChangeAssetOrderAction.builder().assetOrder(Collections.singletonList("assetOrder")) } };
    }

    @Test
    public void staged() {
        VariantChangeAssetOrderAction value = VariantChangeAssetOrderAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetOrder() {
        VariantChangeAssetOrderAction value = VariantChangeAssetOrderAction.of();
        value.setAssetOrder(Collections.singletonList("assetOrder"));
        Assertions.assertThat(value.getAssetOrder()).isEqualTo(Collections.singletonList("assetOrder"));
    }
}
