
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchDateTimeRangeExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchDateTimeRangeExpressionBuilder builder) {
        SearchDateTimeRangeExpression searchDateTimeRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchDateTimeRangeExpression).isInstanceOf(SearchDateTimeRangeExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "range", SearchDateTimeRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchDateTimeRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchDateTimeRangeExpression value = SearchDateTimeRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchDateTimeRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchDateTimeRangeValueImpl());
    }
}
