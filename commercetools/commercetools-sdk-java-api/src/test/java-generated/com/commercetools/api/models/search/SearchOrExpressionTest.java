
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
public class SearchOrExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchOrExpressionBuilder builder) {
        SearchOrExpression searchOrExpression = builder.buildUnchecked();
        Assertions.assertThat(searchOrExpression).isInstanceOf(SearchOrExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchOrExpression.builder()
                .or(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl())) } };
    }

    @Test
    public void or() {
        SearchOrExpression value = SearchOrExpression.of();
        value.setOr(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
        Assertions.assertThat(value.getOr())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.search.SearchQueryImpl()));
    }
}
