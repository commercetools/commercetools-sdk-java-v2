
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchTimeRangeExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchTimeRangeExpressionBuilder builder) {
        SearchTimeRangeExpression searchTimeRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchTimeRangeExpression).isInstanceOf(SearchTimeRangeExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "range", SearchTimeRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchTimeRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchTimeRangeExpression value = SearchTimeRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchTimeRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchTimeRangeValueImpl());
    }
}
