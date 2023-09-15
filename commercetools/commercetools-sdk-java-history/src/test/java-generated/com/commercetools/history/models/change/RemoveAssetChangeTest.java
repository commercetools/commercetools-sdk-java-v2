
package com.commercetools.history.models.change;

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
public class RemoveAssetChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveAssetChangeBuilder builder) {
        RemoveAssetChange removeAssetChange = builder.buildUnchecked();
        Assertions.assertThat(removeAssetChange).isInstanceOf(RemoveAssetChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveAssetChange.builder().change("change") }, new Object[] {
                RemoveAssetChange.builder().previousValue(new com.commercetools.history.models.common.AssetImpl()) } };
    }

    @Test
    public void change() {
        RemoveAssetChange value = RemoveAssetChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveAssetChange value = RemoveAssetChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AssetImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AssetImpl());
    }
}
