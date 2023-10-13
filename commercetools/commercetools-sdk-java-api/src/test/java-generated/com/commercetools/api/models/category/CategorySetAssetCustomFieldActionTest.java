
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
public class CategorySetAssetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategorySetAssetCustomFieldActionBuilder builder) {
        CategorySetAssetCustomFieldAction categorySetAssetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetCustomFieldAction).isInstanceOf(CategorySetAssetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategorySetAssetCustomFieldAction.builder().assetId("assetId") },
                new Object[] { CategorySetAssetCustomFieldAction.builder().assetKey("assetKey") },
                new Object[] { CategorySetAssetCustomFieldAction.builder().name("name") },
                new Object[] { CategorySetAssetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void assetId() {
        CategorySetAssetCustomFieldAction value = CategorySetAssetCustomFieldAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategorySetAssetCustomFieldAction value = CategorySetAssetCustomFieldAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        CategorySetAssetCustomFieldAction value = CategorySetAssetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CategorySetAssetCustomFieldAction value = CategorySetAssetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
