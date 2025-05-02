
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAssetSourcesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAssetSourcesChangeBuilder builder) {
        SetAssetSourcesChange setAssetSourcesChange = builder.buildUnchecked();
        Assertions.assertThat(setAssetSourcesChange).isInstanceOf(SetAssetSourcesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAssetSourcesChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetAssetSourcesChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.AssetSourceImpl())) },
                new Object[] { "nextValue",
                        SetAssetSourcesChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.AssetSourceImpl())) },
                new Object[] { "asset", SetAssetSourcesChange.builder()
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
