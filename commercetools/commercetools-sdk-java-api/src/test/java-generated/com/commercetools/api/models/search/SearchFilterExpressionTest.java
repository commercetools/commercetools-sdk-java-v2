
package com.commercetools.api.models.search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchFilterExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchFilterExpressionBuilder builder) {
        SearchFilterExpression searchFilterExpression = builder.buildUnchecked();
        Assertions.assertThat(searchFilterExpression).isInstanceOf(SearchFilterExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "filter", SearchFilterExpression.builder()
                .filter(
                    Collections.singletonList(new com.commercetools.api.models.search.SearchQueryExpressionImpl())) } };
    }

    @Test
    public void filter() {
        SearchFilterExpression value = SearchFilterExpression.of();
        value.setFilter(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryExpressionImpl()));
        Assertions.assertThat(value.getFilter())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.search.SearchQueryExpressionImpl()));
    }
}
