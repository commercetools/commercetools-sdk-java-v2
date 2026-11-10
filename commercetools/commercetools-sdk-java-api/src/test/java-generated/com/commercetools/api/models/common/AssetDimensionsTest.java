
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssetDimensionsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssetDimensionsBuilder builder) {
        AssetDimensions assetDimensions = builder.buildUnchecked();
        Assertions.assertThat(assetDimensions).isInstanceOf(AssetDimensions.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "w", AssetDimensions.builder().w(5) },
                new Object[] { "h", AssetDimensions.builder().h(6) } };
    }

    @Test
    public void w() {
        AssetDimensions value = AssetDimensions.of();
        value.setW(5);
        Assertions.assertThat(value.getW()).isEqualTo(5);
    }

    @Test
    public void h() {
        AssetDimensions value = AssetDimensions.of();
        value.setH(6);
        Assertions.assertThat(value.getH()).isEqualTo(6);
    }
}
