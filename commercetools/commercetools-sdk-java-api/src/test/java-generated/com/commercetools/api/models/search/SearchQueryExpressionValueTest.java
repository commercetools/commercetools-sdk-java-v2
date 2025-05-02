
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchQueryExpressionValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchQueryExpressionValueBuilder builder) {
        SearchQueryExpressionValue searchQueryExpressionValue = builder.buildUnchecked();
        Assertions.assertThat(searchQueryExpressionValue).isInstanceOf(SearchQueryExpressionValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", SearchQueryExpressionValue.builder().field("field") },
                new Object[] { "boost", SearchQueryExpressionValue.builder().boost(0.8968434466791833) },
                new Object[] { "fieldType", SearchQueryExpressionValue.builder()
                        .fieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean")) } };
    }

    @Test
    public void field() {
        SearchQueryExpressionValue value = SearchQueryExpressionValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void boost() {
        SearchQueryExpressionValue value = SearchQueryExpressionValue.of();
        value.setBoost(0.8968434466791833);
        Assertions.assertThat(value.getBoost()).isEqualTo(0.8968434466791833);
    }

    @Test
    public void fieldType() {
        SearchQueryExpressionValue value = SearchQueryExpressionValue.of();
        value.setFieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
        Assertions.assertThat(value.getFieldType())
                .isEqualTo(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
    }
}
