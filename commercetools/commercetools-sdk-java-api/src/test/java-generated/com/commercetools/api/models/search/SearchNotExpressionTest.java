
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
public class SearchNotExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchNotExpressionBuilder builder) {
        SearchNotExpression searchNotExpression = builder.buildUnchecked();
        Assertions.assertThat(searchNotExpression).isInstanceOf(SearchNotExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchNotExpression.builder()
                .not(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl())) } };
    }

    @Test
    public void not() {
        SearchNotExpression value = SearchNotExpression.of();
        value.setNot(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
        Assertions.assertThat(value.getNot())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
    }
}
