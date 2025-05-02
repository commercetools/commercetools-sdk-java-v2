
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchNumberRangeExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchNumberRangeExpressionBuilder builder) {
        SearchNumberRangeExpression searchNumberRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchNumberRangeExpression).isInstanceOf(SearchNumberRangeExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "range", SearchNumberRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchNumberRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchNumberRangeExpression value = SearchNumberRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchNumberRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchNumberRangeValueImpl());
    }
}
