
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
public class CategorySetAssetSourcesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategorySetAssetSourcesActionBuilder builder) {
        CategorySetAssetSourcesAction categorySetAssetSourcesAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetSourcesAction).isInstanceOf(CategorySetAssetSourcesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategorySetAssetSourcesAction.builder().assetId("assetId") },
                new Object[] { CategorySetAssetSourcesAction.builder().assetKey("assetKey") },
                new Object[] { CategorySetAssetSourcesAction.builder()
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
