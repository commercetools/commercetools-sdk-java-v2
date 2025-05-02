
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchPrefixExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchPrefixExpressionBuilder builder) {
        SearchPrefixExpression searchPrefixExpression = builder.buildUnchecked();
        Assertions.assertThat(searchPrefixExpression).isInstanceOf(SearchPrefixExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "prefix", SearchPrefixExpression.builder()
                .prefix(new com.commercetools.api.models.search.SearchAnyValueImpl()) } };
    }

    @Test
    public void prefix() {
        SearchPrefixExpression value = SearchPrefixExpression.of();
        value.setPrefix(new com.commercetools.api.models.search.SearchAnyValueImpl());
        Assertions.assertThat(value.getPrefix())
                .isEqualTo(new com.commercetools.api.models.search.SearchAnyValueImpl());
    }
}
