
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetAssetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetAssetKeyActionBuilder builder) {
        CategorySetAssetKeyAction categorySetAssetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetKeyAction).isInstanceOf(CategorySetAssetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "assetId", CategorySetAssetKeyAction.builder().assetId("assetId") },
                new Object[] { "assetKey", CategorySetAssetKeyAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void assetId() {
        CategorySetAssetKeyAction value = CategorySetAssetKeyAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategorySetAssetKeyAction value = CategorySetAssetKeyAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
