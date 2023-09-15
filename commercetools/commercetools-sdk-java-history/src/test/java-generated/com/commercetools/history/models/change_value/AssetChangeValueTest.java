
package com.commercetools.history.models.change_value;

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
public class AssetChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssetChangeValueBuilder builder) {
        AssetChangeValue assetChangeValue = builder.buildUnchecked();
        Assertions.assertThat(assetChangeValue).isInstanceOf(AssetChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssetChangeValue.builder().id("id") }, new Object[] {
                AssetChangeValue.builder().name(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void id() {
        AssetChangeValue value = AssetChangeValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        AssetChangeValue value = AssetChangeValue.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
