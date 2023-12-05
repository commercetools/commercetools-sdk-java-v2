
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
public class SetAssetCustomFieldChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetAssetCustomFieldChangeBuilder builder) {
        SetAssetCustomFieldChange setAssetCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setAssetCustomFieldChange).isInstanceOf(SetAssetCustomFieldChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetAssetCustomFieldChange.builder().change("change") },
                new Object[] { SetAssetCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { SetAssetCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { SetAssetCustomFieldChange.builder().name("name") },
                new Object[] { SetAssetCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { SetAssetCustomFieldChange.builder()
                        .asset(new com.commercetools.history.models.change_value.AssetChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetAssetCustomFieldChange value = SetAssetCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAssetCustomFieldChange value = SetAssetCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetAssetCustomFieldChange value = SetAssetCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void name() {
        SetAssetCustomFieldChange value = SetAssetCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetAssetCustomFieldChange value = SetAssetCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void asset() {
        SetAssetCustomFieldChange value = SetAssetCustomFieldChange.of();
        value.setAsset(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
        Assertions.assertThat(value.getAsset())
                .isEqualTo(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
    }
}
