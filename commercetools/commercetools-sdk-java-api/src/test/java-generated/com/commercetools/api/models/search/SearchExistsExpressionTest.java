
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchExistsExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchExistsExpressionBuilder builder) {
        SearchExistsExpression searchExistsExpression = builder.buildUnchecked();
        Assertions.assertThat(searchExistsExpression).isInstanceOf(SearchExistsExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "exists", SearchExistsExpression.builder()
                .exists(new com.commercetools.api.models.search.SearchExistsValueImpl()) } };
    }

    @Test
    public void exists() {
        SearchExistsExpression value = SearchExistsExpression.of();
        value.setExists(new com.commercetools.api.models.search.SearchExistsValueImpl());
        Assertions.assertThat(value.getExists())
                .isEqualTo(new com.commercetools.api.models.search.SearchExistsValueImpl());
    }
}
