
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchExactExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchExactExpressionBuilder builder) {
        SearchExactExpression searchExactExpression = builder.buildUnchecked();
        Assertions.assertThat(searchExactExpression).isInstanceOf(SearchExactExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "exact", SearchExactExpression.builder()
                .exact(new com.commercetools.api.models.search.SearchExactValueImpl()) } };
    }

    @Test
    public void exact() {
        SearchExactExpression value = SearchExactExpression.of();
        value.setExact(new com.commercetools.api.models.search.SearchExactValueImpl());
        Assertions.assertThat(value.getExact())
                .isEqualTo(new com.commercetools.api.models.search.SearchExactValueImpl());
    }
}
