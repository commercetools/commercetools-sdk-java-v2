
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAssetCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAssetCustomFieldChangeBuilder builder) {
        SetAssetCustomFieldChange setAssetCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setAssetCustomFieldChange).isInstanceOf(SetAssetCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAssetCustomFieldChange.builder().change("change") },
                new Object[] { "previousValue", SetAssetCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetAssetCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { "name", SetAssetCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId", SetAssetCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "asset", SetAssetCustomFieldChange.builder()
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
