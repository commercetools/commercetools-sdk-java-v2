
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
public class CategoryAddAssetActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryAddAssetActionBuilder builder) {
        CategoryAddAssetAction categoryAddAssetAction = builder.buildUnchecked();
        Assertions.assertThat(categoryAddAssetAction).isInstanceOf(CategoryAddAssetAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CategoryAddAssetAction.builder()
                        .asset(new com.commercetools.api.models.common.AssetDraftImpl()) },
                new Object[] { CategoryAddAssetAction.builder().position(4) } };
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
