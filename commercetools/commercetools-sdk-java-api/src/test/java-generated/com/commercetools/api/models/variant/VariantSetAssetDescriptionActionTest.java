
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAssetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAssetDescriptionActionBuilder builder) {
        VariantSetAssetDescriptionAction variantSetAssetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAssetDescriptionAction).isInstanceOf(VariantSetAssetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantSetAssetDescriptionAction.builder().staged(true) },
                new Object[] { "assetId", VariantSetAssetDescriptionAction.builder().assetId("assetId") },
                new Object[] { "assetKey", VariantSetAssetDescriptionAction.builder().assetKey("assetKey") },
                new Object[] { "description", VariantSetAssetDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void staged() {
        VariantSetAssetDescriptionAction value = VariantSetAssetDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        VariantSetAssetDescriptionAction value = VariantSetAssetDescriptionAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        VariantSetAssetDescriptionAction value = VariantSetAssetDescriptionAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void description() {
        VariantSetAssetDescriptionAction value = VariantSetAssetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
