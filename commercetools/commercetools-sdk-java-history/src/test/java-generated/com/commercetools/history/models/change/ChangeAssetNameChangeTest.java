
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeAssetNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeAssetNameChangeBuilder builder) {
        ChangeAssetNameChange changeAssetNameChange = builder.buildUnchecked();
        Assertions.assertThat(changeAssetNameChange).isInstanceOf(ChangeAssetNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeAssetNameChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeAssetNameChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue",
                        ChangeAssetNameChange.builder()
                                .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "asset",
                        ChangeAssetNameChange.builder()
                                .asset(new com.commercetools.history.models.change_value.AssetChangeValueImpl()) },
                new Object[] { "catalogData", ChangeAssetNameChange.builder().catalogData("catalogData") },
                new Object[] { "variant", ChangeAssetNameChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        ChangeAssetNameChange value = ChangeAssetNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAssetNameChange value = ChangeAssetNameChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ChangeAssetNameChange value = ChangeAssetNameChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void asset() {
        ChangeAssetNameChange value = ChangeAssetNameChange.of();
        value.setAsset(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
        Assertions.assertThat(value.getAsset())
                .isEqualTo(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
    }

    @Test
    public void catalogData() {
        ChangeAssetNameChange value = ChangeAssetNameChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        ChangeAssetNameChange value = ChangeAssetNameChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
