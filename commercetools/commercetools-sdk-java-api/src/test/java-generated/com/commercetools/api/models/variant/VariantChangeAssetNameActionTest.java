
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantChangeAssetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantChangeAssetNameActionBuilder builder) {
        VariantChangeAssetNameAction variantChangeAssetNameAction = builder.buildUnchecked();
        Assertions.assertThat(variantChangeAssetNameAction).isInstanceOf(VariantChangeAssetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantChangeAssetNameAction.builder().staged(true) },
                new Object[] { "assetId", VariantChangeAssetNameAction.builder().assetId("assetId") },
                new Object[] { "assetKey", VariantChangeAssetNameAction.builder().assetKey("assetKey") },
                new Object[] { "name", VariantChangeAssetNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void staged() {
        VariantChangeAssetNameAction value = VariantChangeAssetNameAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        VariantChangeAssetNameAction value = VariantChangeAssetNameAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        VariantChangeAssetNameAction value = VariantChangeAssetNameAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        VariantChangeAssetNameAction value = VariantChangeAssetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
