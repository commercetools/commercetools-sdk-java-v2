
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchFullTextPrefixExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchFullTextPrefixExpressionBuilder builder) {
        SearchFullTextPrefixExpression searchFullTextPrefixExpression = builder.buildUnchecked();
        Assertions.assertThat(searchFullTextPrefixExpression).isInstanceOf(SearchFullTextPrefixExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fullTextPrefix", SearchFullTextPrefixExpression.builder()
                .fullTextPrefix(new com.commercetools.api.models.search.SearchFullTextPrefixValueImpl()) } };
    }

    @Test
    public void fullTextPrefix() {
        SearchFullTextPrefixExpression value = SearchFullTextPrefixExpression.of();
        value.setFullTextPrefix(new com.commercetools.api.models.search.SearchFullTextPrefixValueImpl());
        Assertions.assertThat(value.getFullTextPrefix())
                .isEqualTo(new com.commercetools.api.models.search.SearchFullTextPrefixValueImpl());
    }
}
