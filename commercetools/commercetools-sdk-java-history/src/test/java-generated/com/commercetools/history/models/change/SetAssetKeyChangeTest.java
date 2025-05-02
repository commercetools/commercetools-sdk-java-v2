
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAssetKeyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAssetKeyChangeBuilder builder) {
        SetAssetKeyChange setAssetKeyChange = builder.buildUnchecked();
        Assertions.assertThat(setAssetKeyChange).isInstanceOf(SetAssetKeyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAssetKeyChange.builder().change("change") },
                new Object[] { "previousValue", SetAssetKeyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetAssetKeyChange.builder().nextValue("nextValue") },
                new Object[] { "asset", SetAssetKeyChange.builder()
                        .asset(new com.commercetools.history.models.change_value.AssetChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetAssetKeyChange value = SetAssetKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAssetKeyChange value = SetAssetKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetAssetKeyChange value = SetAssetKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void asset() {
        SetAssetKeyChange value = SetAssetKeyChange.of();
        value.setAsset(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
        Assertions.assertThat(value.getAsset())
                .isEqualTo(new com.commercetools.history.models.change_value.AssetChangeValueImpl());
    }
}
