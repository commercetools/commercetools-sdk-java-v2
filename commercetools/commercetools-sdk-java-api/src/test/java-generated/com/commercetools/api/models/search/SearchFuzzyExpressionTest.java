
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchFuzzyExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchFuzzyExpressionBuilder builder) {
        SearchFuzzyExpression searchFuzzyExpression = builder.buildUnchecked();
        Assertions.assertThat(searchFuzzyExpression).isInstanceOf(SearchFuzzyExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fuzzy", SearchFuzzyExpression.builder()
                .fuzzy(new com.commercetools.api.models.search.SearchFuzzyValueImpl()) } };
    }

    @Test
    public void fuzzy() {
        SearchFuzzyExpression value = SearchFuzzyExpression.of();
        value.setFuzzy(new com.commercetools.api.models.search.SearchFuzzyValueImpl());
        Assertions.assertThat(value.getFuzzy())
                .isEqualTo(new com.commercetools.api.models.search.SearchFuzzyValueImpl());
    }
}
