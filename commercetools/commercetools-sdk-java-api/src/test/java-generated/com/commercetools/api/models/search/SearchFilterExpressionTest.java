
package com.commercetools.api.models.search;

import java.util.Collections;

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
public class SearchFilterExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchFilterExpressionBuilder builder) {
        SearchFilterExpression searchFilterExpression = builder.buildUnchecked();
        Assertions.assertThat(searchFilterExpression).isInstanceOf(SearchFilterExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchFilterExpression.builder()
                .filter(
                    Collections.singletonList(new com.commercetools.api.models.search.SearchQueryExpressionImpl())) } };
    }

    @Test
    public void filter() {
        SearchFilterExpression value = SearchFilterExpression.of();
        value.setFilter(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryExpressionImpl()));
        Assertions.assertThat(value.getFilter())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.search.SearchQueryExpressionImpl()));
    }
}
