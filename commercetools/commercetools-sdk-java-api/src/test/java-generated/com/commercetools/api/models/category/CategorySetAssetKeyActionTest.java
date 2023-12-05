
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
public class CategorySetAssetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategorySetAssetKeyActionBuilder builder) {
        CategorySetAssetKeyAction categorySetAssetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetKeyAction).isInstanceOf(CategorySetAssetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategorySetAssetKeyAction.builder().assetId("assetId") },
                new Object[] { CategorySetAssetKeyAction.builder().assetKey("assetKey") } };
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
