
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddAssetChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddAssetChangeBuilder builder) {
        AddAssetChange addAssetChange = builder.buildUnchecked();
        Assertions.assertThat(addAssetChange).isInstanceOf(AddAssetChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddAssetChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddAssetChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AssetImpl()) },
                new Object[] { "nextValue",
                        AddAssetChange.builder().nextValue(new com.commercetools.history.models.common.AssetImpl()) } };
    }

    @Test
    public void change() {
        AddAssetChange value = AddAssetChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddAssetChange value = AddAssetChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AssetImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AssetImpl());
    }

    @Test
    public void nextValue() {
        AddAssetChange value = AddAssetChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AssetImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.AssetImpl());
    }
}
