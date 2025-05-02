
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchWildCardExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchWildCardExpressionBuilder builder) {
        SearchWildCardExpression searchWildCardExpression = builder.buildUnchecked();
        Assertions.assertThat(searchWildCardExpression).isInstanceOf(SearchWildCardExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "wildcard", SearchWildCardExpression.builder()
                .wildcard(new com.commercetools.api.models.search.SearchAnyValueImpl()) } };
    }

    @Test
    public void wildcard() {
        SearchWildCardExpression value = SearchWildCardExpression.of();
        value.setWildcard(new com.commercetools.api.models.search.SearchAnyValueImpl());
        Assertions.assertThat(value.getWildcard())
                .isEqualTo(new com.commercetools.api.models.search.SearchAnyValueImpl());
    }
}
