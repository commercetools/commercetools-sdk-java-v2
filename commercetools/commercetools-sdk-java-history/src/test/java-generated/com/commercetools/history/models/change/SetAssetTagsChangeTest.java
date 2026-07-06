
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAssetTagsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAssetTagsChangeBuilder builder) {
        SetAssetTagsChange setAssetTagsChange = builder.buildUnchecked();
        Assertions.assertThat(setAssetTagsChange).isInstanceOf(SetAssetTagsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAssetTagsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetAssetTagsChange.builder().previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue",
                        SetAssetTagsChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { "asset",
                        SetAssetTagsChange.builder()
                                .asset(new com.commercetools.history.models.change_value.AssetChangeValueImpl()) },
                new Object[] { "catalogData", SetAssetTagsChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetAssetTagsChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetAssetTagsChange value = SetAssetTagsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAssetTagsChange value = SetAssetTagsChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        SetAssetTagsChange value = SetAssetTagsChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void asset() {
        SetAssetTagsChange value = SetAssetTagsChange.of();
        value.setAsset(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
        Assertions.assertThat(value.getAsset())
                .isEqualTo(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
    }

    @Test
    public void catalogData() {
        SetAssetTagsChange value = SetAssetTagsChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetAssetTagsChange value = SetAssetTagsChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
