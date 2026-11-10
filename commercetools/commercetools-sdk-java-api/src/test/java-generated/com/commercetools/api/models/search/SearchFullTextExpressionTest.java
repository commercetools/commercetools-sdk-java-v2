
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchFullTextExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchFullTextExpressionBuilder builder) {
        SearchFullTextExpression searchFullTextExpression = builder.buildUnchecked();
        Assertions.assertThat(searchFullTextExpression).isInstanceOf(SearchFullTextExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fullText", SearchFullTextExpression.builder()
                .fullText(new com.commercetools.api.models.search.SearchFullTextValueImpl()) } };
    }

    @Test
    public void fullText() {
        SearchFullTextExpression value = SearchFullTextExpression.of();
        value.setFullText(new com.commercetools.api.models.search.SearchFullTextValueImpl());
        Assertions.assertThat(value.getFullText())
                .isEqualTo(new com.commercetools.api.models.search.SearchFullTextValueImpl());
    }
}
