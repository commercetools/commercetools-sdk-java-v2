
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FacetTermTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, FacetTermBuilder builder) {
        FacetTerm facetTerm = builder.buildUnchecked();
        Assertions.assertThat(facetTerm).isInstanceOf(FacetTerm.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "term", FacetTerm.builder().term("term") },
                new Object[] { "count", FacetTerm.builder().count(2L) },
                new Object[] { "productCount", FacetTerm.builder().productCount(1L) } };
    }

    @Test
    public void term() {
        FacetTerm value = FacetTerm.of();
        value.setTerm("term");
        Assertions.assertThat(value.getTerm()).isEqualTo("term");
    }

    @Test
    public void count() {
        FacetTerm value = FacetTerm.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void productCount() {
        FacetTerm value = FacetTerm.of();
        value.setProductCount(1L);
        Assertions.assertThat(value.getProductCount()).isEqualTo(1L);
    }
}
