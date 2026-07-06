
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveAssetChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveAssetChangeBuilder builder) {
        RemoveAssetChange removeAssetChange = builder.buildUnchecked();
        Assertions.assertThat(removeAssetChange).isInstanceOf(RemoveAssetChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveAssetChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveAssetChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AssetImpl()) },
                new Object[] { "catalogData", RemoveAssetChange.builder().catalogData("catalogData") },
                new Object[] { "variant", RemoveAssetChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        RemoveAssetChange value = RemoveAssetChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveAssetChange value = RemoveAssetChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AssetImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AssetImpl());
    }

    @Test
    public void catalogData() {
        RemoveAssetChange value = RemoveAssetChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        RemoveAssetChange value = RemoveAssetChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
