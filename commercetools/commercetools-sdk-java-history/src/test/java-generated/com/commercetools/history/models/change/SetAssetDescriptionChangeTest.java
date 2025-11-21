
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAssetDescriptionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAssetDescriptionChangeBuilder builder) {
        SetAssetDescriptionChange setAssetDescriptionChange = builder.buildUnchecked();
        Assertions.assertThat(setAssetDescriptionChange).isInstanceOf(SetAssetDescriptionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAssetDescriptionChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetAssetDescriptionChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue",
                        SetAssetDescriptionChange.builder()
                                .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "asset",
                        SetAssetDescriptionChange.builder()
                                .asset(new com.commercetools.history.models.change_value.AssetChangeValueImpl()) },
                new Object[] { "catalogData", SetAssetDescriptionChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetAssetDescriptionChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetAssetDescriptionChange value = SetAssetDescriptionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAssetDescriptionChange value = SetAssetDescriptionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        SetAssetDescriptionChange value = SetAssetDescriptionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void asset() {
        SetAssetDescriptionChange value = SetAssetDescriptionChange.of();
        value.setAsset(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
        Assertions.assertThat(value.getAsset())
                .isEqualTo(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
    }

    @Test
    public void catalogData() {
        SetAssetDescriptionChange value = SetAssetDescriptionChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetAssetDescriptionChange value = SetAssetDescriptionChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
