
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAssetCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAssetCustomTypeChangeBuilder builder) {
        SetAssetCustomTypeChange setAssetCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setAssetCustomTypeChange).isInstanceOf(SetAssetCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAssetCustomTypeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetAssetCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue",
                        SetAssetCustomTypeChange.builder()
                                .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "asset",
                        SetAssetCustomTypeChange.builder()
                                .asset(new com.commercetools.history.models.change_value.AssetChangeValueImpl()) },
                new Object[] { "catalogData", SetAssetCustomTypeChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetAssetCustomTypeChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetAssetCustomTypeChange value = SetAssetCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAssetCustomTypeChange value = SetAssetCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetAssetCustomTypeChange value = SetAssetCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void asset() {
        SetAssetCustomTypeChange value = SetAssetCustomTypeChange.of();
        value.setAsset(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
        Assertions.assertThat(value.getAsset())
                .isEqualTo(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
    }

    @Test
    public void catalogData() {
        SetAssetCustomTypeChange value = SetAssetCustomTypeChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetAssetCustomTypeChange value = SetAssetCustomTypeChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
