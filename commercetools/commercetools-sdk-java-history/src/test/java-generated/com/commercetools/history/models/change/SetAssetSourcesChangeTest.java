
package com.commercetools.history.models.change;

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
public class SetAssetSourcesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetAssetSourcesChangeBuilder builder) {
        SetAssetSourcesChange setAssetSourcesChange = builder.buildUnchecked();
        Assertions.assertThat(setAssetSourcesChange).isInstanceOf(SetAssetSourcesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetAssetSourcesChange.builder().change("change") },
                new Object[] {
                        SetAssetSourcesChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.AssetSourceImpl())) },
                new Object[] {
                        SetAssetSourcesChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.AssetSourceImpl())) },
                new Object[] { SetAssetSourcesChange.builder()
                        .asset(new com.commercetools.history.models.change_value.AssetChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetAssetSourcesChange value = SetAssetSourcesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAssetSourcesChange value = SetAssetSourcesChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.AssetSourceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.AssetSourceImpl()));
    }

    @Test
    public void nextValue() {
        SetAssetSourcesChange value = SetAssetSourcesChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.AssetSourceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.AssetSourceImpl()));
    }

    @Test
    public void asset() {
        SetAssetSourcesChange value = SetAssetSourcesChange.of();
        value.setAsset(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
        Assertions.assertThat(value.getAsset())
                .isEqualTo(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
    }
}
