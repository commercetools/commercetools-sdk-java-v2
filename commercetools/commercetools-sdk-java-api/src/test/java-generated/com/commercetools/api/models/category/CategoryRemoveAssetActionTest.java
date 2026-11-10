
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryRemoveAssetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryRemoveAssetActionBuilder builder) {
        CategoryRemoveAssetAction categoryRemoveAssetAction = builder.buildUnchecked();
        Assertions.assertThat(categoryRemoveAssetAction).isInstanceOf(CategoryRemoveAssetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "assetId", CategoryRemoveAssetAction.builder().assetId("assetId") },
                new Object[] { "assetKey", CategoryRemoveAssetAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void assetId() {
        CategoryRemoveAssetAction value = CategoryRemoveAssetAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategoryRemoveAssetAction value = CategoryRemoveAssetAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
