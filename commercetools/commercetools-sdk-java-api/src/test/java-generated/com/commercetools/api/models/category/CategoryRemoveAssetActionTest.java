
package com.commercetools.api.models.category;

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
public class CategoryRemoveAssetActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryRemoveAssetActionBuilder builder) {
        CategoryRemoveAssetAction categoryRemoveAssetAction = builder.buildUnchecked();
        Assertions.assertThat(categoryRemoveAssetAction).isInstanceOf(CategoryRemoveAssetAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryRemoveAssetAction.builder().assetId("assetId") },
                new Object[] { CategoryRemoveAssetAction.builder().assetKey("assetKey") } };
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
