
package com.commercetools.api.models.search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchOrExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchOrExpressionBuilder builder) {
        SearchOrExpression searchOrExpression = builder.buildUnchecked();
        Assertions.assertThat(searchOrExpression).isInstanceOf(SearchOrExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "or", SearchOrExpression.builder()
                .or(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl())) } };
    }

    @Test
    public void or() {
        SearchOrExpression value = SearchOrExpression.of();
        value.setOr(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
        Assertions.assertThat(value.getOr())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
    }
}
