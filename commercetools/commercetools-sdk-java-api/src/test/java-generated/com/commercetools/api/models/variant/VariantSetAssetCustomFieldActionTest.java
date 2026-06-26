
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAssetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAssetCustomFieldActionBuilder builder) {
        VariantSetAssetCustomFieldAction variantSetAssetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAssetCustomFieldAction).isInstanceOf(VariantSetAssetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantSetAssetCustomFieldAction.builder().staged(true) },
                new Object[] { "assetId", VariantSetAssetCustomFieldAction.builder().assetId("assetId") },
                new Object[] { "assetKey", VariantSetAssetCustomFieldAction.builder().assetKey("assetKey") },
                new Object[] { "name", VariantSetAssetCustomFieldAction.builder().name("name") },
                new Object[] { "value", VariantSetAssetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void staged() {
        VariantSetAssetCustomFieldAction value = VariantSetAssetCustomFieldAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        VariantSetAssetCustomFieldAction value = VariantSetAssetCustomFieldAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        VariantSetAssetCustomFieldAction value = VariantSetAssetCustomFieldAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        VariantSetAssetCustomFieldAction value = VariantSetAssetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        VariantSetAssetCustomFieldAction value = VariantSetAssetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
