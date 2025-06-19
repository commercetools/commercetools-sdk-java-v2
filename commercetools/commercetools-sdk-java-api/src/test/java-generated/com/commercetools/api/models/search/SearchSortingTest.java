
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchSortingTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchSortingBuilder builder) {
        SearchSorting searchSorting = builder.buildUnchecked();
        Assertions.assertThat(searchSorting).isInstanceOf(SearchSorting.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", SearchSorting.builder().field("field") },
                new Object[] { "language", SearchSorting.builder().language("language") },
                new Object[] { "order",
                        SearchSorting.builder()
                                .order(com.commercetools.api.models.search.SearchSortOrder.findEnum("asc")) },
                new Object[] { "mode",
                        SearchSorting.builder()
                                .mode(com.commercetools.api.models.search.SearchSortMode.findEnum("min")) },
                new Object[] { "fieldType",
                        SearchSorting.builder()
                                .fieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean")) },
                new Object[] { "filter",
                        SearchSorting.builder().filter(new com.commercetools.api.models.search.SearchQueryImpl()) } };
    }

    @Test
    public void field() {
        SearchSorting value = SearchSorting.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void language() {
        SearchSorting value = SearchSorting.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void order() {
        SearchSorting value = SearchSorting.of();
        value.setOrder(com.commercetools.api.models.search.SearchSortOrder.findEnum("asc"));
        Assertions.assertThat(value.getOrder())
                .isEqualTo(com.commercetools.api.models.search.SearchSortOrder.findEnum("asc"));
    }

    @Test
    public void mode() {
        SearchSorting value = SearchSorting.of();
        value.setMode(com.commercetools.api.models.search.SearchSortMode.findEnum("min"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.search.SearchSortMode.findEnum("min"));
    }

    @Test
    public void fieldType() {
        SearchSorting value = SearchSorting.of();
        value.setFieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
        Assertions.assertThat(value.getFieldType())
                .isEqualTo(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
    }

    @Test
    public void filter() {
        SearchSorting value = SearchSorting.of();
        value.setFilter(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getFilter()).isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }
}
