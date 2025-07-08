
package com.commercetools.importapi.models.product_selections;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantExclusionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantExclusionBuilder builder) {
        VariantExclusion variantExclusion = builder.buildUnchecked();
        Assertions.assertThat(variantExclusion).isInstanceOf(VariantExclusion.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "skus", VariantExclusion.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void skus() {
        VariantExclusion value = VariantExclusion.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
