
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssetChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssetChangeValueBuilder builder) {
        AssetChangeValue assetChangeValue = builder.buildUnchecked();
        Assertions.assertThat(assetChangeValue).isInstanceOf(AssetChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", AssetChangeValue.builder().id("id") }, new Object[] { "name",
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
