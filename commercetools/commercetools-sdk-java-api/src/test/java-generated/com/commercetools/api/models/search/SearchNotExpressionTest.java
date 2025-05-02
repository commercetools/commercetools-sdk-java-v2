
package com.commercetools.api.models.search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchNotExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchNotExpressionBuilder builder) {
        SearchNotExpression searchNotExpression = builder.buildUnchecked();
        Assertions.assertThat(searchNotExpression).isInstanceOf(SearchNotExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "not", SearchNotExpression.builder()
                .not(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl())) } };
    }

    @Test
    public void not() {
        SearchNotExpression value = SearchNotExpression.of();
        value.setNot(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
        Assertions.assertThat(value.getNot())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
    }
}
