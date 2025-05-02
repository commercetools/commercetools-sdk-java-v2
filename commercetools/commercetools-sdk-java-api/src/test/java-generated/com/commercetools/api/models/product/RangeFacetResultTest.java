
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RangeFacetResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RangeFacetResultBuilder builder) {
        RangeFacetResult rangeFacetResult = builder.buildUnchecked();
        Assertions.assertThat(rangeFacetResult).isInstanceOf(RangeFacetResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "ranges", RangeFacetResult.builder()
                .ranges(Collections.singletonList(new com.commercetools.api.models.product.FacetRangeImpl())) } };
    }

    @Test
    public void ranges() {
        RangeFacetResult value = RangeFacetResult.of();
        value.setRanges(Collections.singletonList(new com.commercetools.api.models.product.FacetRangeImpl()));
        Assertions.assertThat(value.getRanges())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.FacetRangeImpl()));
    }
}
