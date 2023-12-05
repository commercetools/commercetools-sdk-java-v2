
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
public class AddAssetChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddAssetChangeBuilder builder) {
        AddAssetChange addAssetChange = builder.buildUnchecked();
        Assertions.assertThat(addAssetChange).isInstanceOf(AddAssetChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddAssetChange.builder().change("change") },
                new Object[] { AddAssetChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AssetImpl()) },
                new Object[] {
                        AddAssetChange.builder().nextValue(new com.commercetools.history.models.common.AssetImpl()) } };
    }

    @Test
    public void change() {
        AddAssetChange value = AddAssetChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddAssetChange value = AddAssetChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AssetImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AssetImpl());
    }

    @Test
    public void nextValue() {
        AddAssetChange value = AddAssetChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AssetImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.AssetImpl());
    }
}
