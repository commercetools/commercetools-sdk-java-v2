
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchDateRangeExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchDateRangeExpressionBuilder builder) {
        SearchDateRangeExpression searchDateRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchDateRangeExpression).isInstanceOf(SearchDateRangeExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "range", SearchDateRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchDateRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchDateRangeExpression value = SearchDateRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchDateRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchDateRangeValueImpl());
    }
}
