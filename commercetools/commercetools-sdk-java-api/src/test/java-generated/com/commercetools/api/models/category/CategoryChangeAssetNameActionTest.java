
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryChangeAssetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryChangeAssetNameActionBuilder builder) {
        CategoryChangeAssetNameAction categoryChangeAssetNameAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeAssetNameAction).isInstanceOf(CategoryChangeAssetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "assetId", CategoryChangeAssetNameAction.builder().assetId("assetId") },
                new Object[] { "assetKey", CategoryChangeAssetNameAction.builder().assetKey("assetKey") },
                new Object[] { "name", CategoryChangeAssetNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void assetId() {
        CategoryChangeAssetNameAction value = CategoryChangeAssetNameAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategoryChangeAssetNameAction value = CategoryChangeAssetNameAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        CategoryChangeAssetNameAction value = CategoryChangeAssetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
