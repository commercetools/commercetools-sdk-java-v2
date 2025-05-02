
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryAddAssetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryAddAssetActionBuilder builder) {
        CategoryAddAssetAction categoryAddAssetAction = builder.buildUnchecked();
        Assertions.assertThat(categoryAddAssetAction).isInstanceOf(CategoryAddAssetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "asset",
                        CategoryAddAssetAction.builder()
                                .asset(new com.commercetools.api.models.common.AssetDraftImpl()) },
                new Object[] { "position", CategoryAddAssetAction.builder().position(4) } };
    }

    @Test
    public void asset() {
        CategoryAddAssetAction value = CategoryAddAssetAction.of();
        value.setAsset(new com.commercetools.api.models.common.AssetDraftImpl());
        Assertions.assertThat(value.getAsset()).isEqualTo(new com.commercetools.api.models.common.AssetDraftImpl());
    }

    @Test
    public void position() {
        CategoryAddAssetAction value = CategoryAddAssetAction.of();
        value.setPosition(4);
        Assertions.assertThat(value.getPosition()).isEqualTo(4);
    }
}
