
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchLongRangeExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchLongRangeExpressionBuilder builder) {
        SearchLongRangeExpression searchLongRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchLongRangeExpression).isInstanceOf(SearchLongRangeExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "range", SearchLongRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchLongRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchLongRangeExpression value = SearchLongRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchLongRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchLongRangeValueImpl());
    }
}
