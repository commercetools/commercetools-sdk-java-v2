
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
public class CategoryChangeAssetNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryChangeAssetNameActionBuilder builder) {
        CategoryChangeAssetNameAction categoryChangeAssetNameAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeAssetNameAction).isInstanceOf(CategoryChangeAssetNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryChangeAssetNameAction.builder().assetId("assetId") },
                new Object[] { CategoryChangeAssetNameAction.builder().assetKey("assetKey") },
                new Object[] { CategoryChangeAssetNameAction.builder()
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
