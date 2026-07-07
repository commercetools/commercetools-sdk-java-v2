
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAssetTagsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAssetTagsActionBuilder builder) {
        VariantSetAssetTagsAction variantSetAssetTagsAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAssetTagsAction).isInstanceOf(VariantSetAssetTagsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "staged", VariantSetAssetTagsAction.builder().staged(true) },
                new Object[] { "assetId", VariantSetAssetTagsAction.builder().assetId("assetId") },
                new Object[] { "assetKey", VariantSetAssetTagsAction.builder().assetKey("assetKey") },
                new Object[] { "tags", VariantSetAssetTagsAction.builder().tags(Collections.singletonList("tags")) } };
    }

    @Test
    public void staged() {
        VariantSetAssetTagsAction value = VariantSetAssetTagsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        VariantSetAssetTagsAction value = VariantSetAssetTagsAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        VariantSetAssetTagsAction value = VariantSetAssetTagsAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void tags() {
        VariantSetAssetTagsAction value = VariantSetAssetTagsAction.of();
        value.setTags(Collections.singletonList("tags"));
        Assertions.assertThat(value.getTags()).isEqualTo(Collections.singletonList("tags"));
    }
}
