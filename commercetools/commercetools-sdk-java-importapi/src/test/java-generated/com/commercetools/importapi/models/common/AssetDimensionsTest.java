
package com.commercetools.importapi.models.common;

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
public class AssetDimensionsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssetDimensionsBuilder builder) {
        AssetDimensions assetDimensions = builder.buildUnchecked();
        Assertions.assertThat(assetDimensions).isInstanceOf(AssetDimensions.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssetDimensions.builder().w(5) },
                new Object[] { AssetDimensions.builder().h(6) } };
    }

    @Test
    public void w() {
        AssetDimensions value = AssetDimensions.of();
        value.setW(5);
        Assertions.assertThat(value.getW()).isEqualTo(5);
    }

    @Test
    public void h() {
        AssetDimensions value = AssetDimensions.of();
        value.setH(6);
        Assertions.assertThat(value.getH()).isEqualTo(6);
    }
}
