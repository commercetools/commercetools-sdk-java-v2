
package com.commercetools.api.models.search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchAndExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchAndExpressionBuilder builder) {
        SearchAndExpression searchAndExpression = builder.buildUnchecked();
        Assertions.assertThat(searchAndExpression).isInstanceOf(SearchAndExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "and", SearchAndExpression.builder()
                .and(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl())) } };
    }

    @Test
    public void and() {
        SearchAndExpression value = SearchAndExpression.of();
        value.setAnd(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
        Assertions.assertThat(value.getAnd())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
    }
}
