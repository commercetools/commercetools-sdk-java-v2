
package com.commercetools.api.models.search;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class SearchSortingTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchSortingBuilder builder) {
        SearchSorting searchSorting = builder.buildUnchecked();
        Assertions.assertThat(searchSorting).isInstanceOf(SearchSorting.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchSorting.builder().field("field") },
                new Object[] { SearchSorting.builder().language("language") },
                new Object[] { SearchSorting.builder()
                        .order(com.commercetools.api.models.search.SearchSortOrder.findEnum("asc")) },
                new Object[] { SearchSorting.builder()
                        .mode(com.commercetools.api.models.search.SearchSortMode.findEnum("min")) },
                new Object[] { SearchSorting.builder()
                        .fieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean")) },
                new Object[] { SearchSorting.builder()
                        .filter(new com.commercetools.api.models.search.SearchQueryExpressionImpl()) } };
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
        value.setFilter(new com.commercetools.api.models.search.SearchQueryExpressionImpl());
        Assertions.assertThat(value.getFilter())
                .isEqualTo(new com.commercetools.api.models.search.SearchQueryExpressionImpl());
    }
}
