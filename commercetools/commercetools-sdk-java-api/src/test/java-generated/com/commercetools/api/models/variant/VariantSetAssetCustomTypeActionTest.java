
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAssetCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAssetCustomTypeActionBuilder builder) {
        VariantSetAssetCustomTypeAction variantSetAssetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAssetCustomTypeAction).isInstanceOf(VariantSetAssetCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantSetAssetCustomTypeAction.builder().staged(true) },
                new Object[] { "assetId", VariantSetAssetCustomTypeAction.builder().assetId("assetId") },
                new Object[] { "assetKey", VariantSetAssetCustomTypeAction.builder().assetKey("assetKey") },
                new Object[] { "type",
                        VariantSetAssetCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", VariantSetAssetCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void staged() {
        VariantSetAssetCustomTypeAction value = VariantSetAssetCustomTypeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        VariantSetAssetCustomTypeAction value = VariantSetAssetCustomTypeAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        VariantSetAssetCustomTypeAction value = VariantSetAssetCustomTypeAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void type() {
        VariantSetAssetCustomTypeAction value = VariantSetAssetCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        VariantSetAssetCustomTypeAction value = VariantSetAssetCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
