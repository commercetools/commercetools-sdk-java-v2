
package com.commercetools.api.models.category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetAssetTagsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetAssetTagsActionBuilder builder) {
        CategorySetAssetTagsAction categorySetAssetTagsAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetTagsAction).isInstanceOf(CategorySetAssetTagsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "assetId", CategorySetAssetTagsAction.builder().assetId("assetId") },
                new Object[] { "assetKey", CategorySetAssetTagsAction.builder().assetKey("assetKey") },
                new Object[] { "tags", CategorySetAssetTagsAction.builder().tags(Collections.singletonList("tags")) } };
    }

    @Test
    public void assetId() {
        CategorySetAssetTagsAction value = CategorySetAssetTagsAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategorySetAssetTagsAction value = CategorySetAssetTagsAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void tags() {
        CategorySetAssetTagsAction value = CategorySetAssetTagsAction.of();
        value.setTags(Collections.singletonList("tags"));
        Assertions.assertThat(value.getTags()).isEqualTo(Collections.singletonList("tags"));
    }
}
