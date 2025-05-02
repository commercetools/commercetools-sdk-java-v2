
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TermFacetResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TermFacetResultBuilder builder) {
        TermFacetResult termFacetResult = builder.buildUnchecked();
        Assertions.assertThat(termFacetResult).isInstanceOf(TermFacetResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "dataType",
                        TermFacetResult.builder()
                                .dataType(com.commercetools.api.models.product.TermFacetResultType.findEnum("text")) },
                new Object[] { "missing", TermFacetResult.builder().missing(3L) },
                new Object[] { "total", TermFacetResult.builder().total(1L) },
                new Object[] { "other", TermFacetResult.builder().other(6L) },
                new Object[] { "terms", TermFacetResult.builder()
                        .terms(Collections.singletonList(new com.commercetools.api.models.product.FacetTermImpl())) } };
    }

    @Test
    public void dataType() {
        TermFacetResult value = TermFacetResult.of();
        value.setDataType(com.commercetools.api.models.product.TermFacetResultType.findEnum("text"));
        Assertions.assertThat(value.getDataType())
                .isEqualTo(com.commercetools.api.models.product.TermFacetResultType.findEnum("text"));
    }

    @Test
    public void missing() {
        TermFacetResult value = TermFacetResult.of();
        value.setMissing(3L);
        Assertions.assertThat(value.getMissing()).isEqualTo(3L);
    }

    @Test
    public void total() {
        TermFacetResult value = TermFacetResult.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void other() {
        TermFacetResult value = TermFacetResult.of();
        value.setOther(6L);
        Assertions.assertThat(value.getOther()).isEqualTo(6L);
    }

    @Test
    public void terms() {
        TermFacetResult value = TermFacetResult.of();
        value.setTerms(Collections.singletonList(new com.commercetools.api.models.product.FacetTermImpl()));
        Assertions.assertThat(value.getTerms())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.FacetTermImpl()));
    }
}
