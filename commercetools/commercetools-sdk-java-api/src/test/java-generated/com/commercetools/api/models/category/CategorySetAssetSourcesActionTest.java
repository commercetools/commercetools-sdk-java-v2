
package com.commercetools.api.models.category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetAssetSourcesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetAssetSourcesActionBuilder builder) {
        CategorySetAssetSourcesAction categorySetAssetSourcesAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetSourcesAction).isInstanceOf(CategorySetAssetSourcesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "assetId", CategorySetAssetSourcesAction.builder().assetId("assetId") },
                new Object[] { "assetKey", CategorySetAssetSourcesAction.builder().assetKey("assetKey") },
                new Object[] { "sources", CategorySetAssetSourcesAction.builder()
                        .sources(
                            Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl())) } };
    }

    @Test
    public void assetId() {
        CategorySetAssetSourcesAction value = CategorySetAssetSourcesAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategorySetAssetSourcesAction value = CategorySetAssetSourcesAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void sources() {
        CategorySetAssetSourcesAction value = CategorySetAssetSourcesAction.of();
        value.setSources(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
        Assertions.assertThat(value.getSources())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
    }
}
