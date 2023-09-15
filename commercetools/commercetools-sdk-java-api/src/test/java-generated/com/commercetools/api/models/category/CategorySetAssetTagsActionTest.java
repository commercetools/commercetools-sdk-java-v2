
package com.commercetools.api.models.category;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CategorySetAssetTagsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategorySetAssetTagsActionBuilder builder) {
        CategorySetAssetTagsAction categorySetAssetTagsAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetTagsAction).isInstanceOf(CategorySetAssetTagsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategorySetAssetTagsAction.builder().assetId("assetId") },
                new Object[] { CategorySetAssetTagsAction.builder().assetKey("assetKey") },
                new Object[] { CategorySetAssetTagsAction.builder().tags(Collections.singletonList("tags")) } };
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
