
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
public class CategoryChangeAssetOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryChangeAssetOrderActionBuilder builder) {
        CategoryChangeAssetOrderAction categoryChangeAssetOrderAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeAssetOrderAction).isInstanceOf(CategoryChangeAssetOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                CategoryChangeAssetOrderAction.builder().assetOrder(Collections.singletonList("assetOrder")) } };
    }

    @Test
    public void assetOrder() {
        CategoryChangeAssetOrderAction value = CategoryChangeAssetOrderAction.of();
        value.setAssetOrder(Collections.singletonList("assetOrder"));
        Assertions.assertThat(value.getAssetOrder()).isEqualTo(Collections.singletonList("assetOrder"));
    }
}
