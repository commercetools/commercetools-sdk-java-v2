
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetAssetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetAssetDescriptionActionBuilder builder) {
        CategorySetAssetDescriptionAction categorySetAssetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetDescriptionAction).isInstanceOf(CategorySetAssetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "assetId", CategorySetAssetDescriptionAction.builder().assetId("assetId") },
                new Object[] { "assetKey", CategorySetAssetDescriptionAction.builder().assetKey("assetKey") },
                new Object[] { "description", CategorySetAssetDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void assetId() {
        CategorySetAssetDescriptionAction value = CategorySetAssetDescriptionAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategorySetAssetDescriptionAction value = CategorySetAssetDescriptionAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void description() {
        CategorySetAssetDescriptionAction value = CategorySetAssetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
