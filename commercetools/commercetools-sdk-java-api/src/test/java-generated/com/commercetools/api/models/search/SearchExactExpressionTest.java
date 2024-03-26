
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
public class SearchExactExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchExactExpressionBuilder builder) {
        SearchExactExpression searchExactExpression = builder.buildUnchecked();
        Assertions.assertThat(searchExactExpression).isInstanceOf(SearchExactExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                SearchExactExpression.builder().exact(new com.commercetools.api.models.search.SearchAnyValueImpl()) } };
    }

    @Test
    public void exact() {
        SearchExactExpression value = SearchExactExpression.of();
        value.setExact(new com.commercetools.api.models.search.SearchAnyValueImpl());
        Assertions.assertThat(value.getExact()).isEqualTo(new com.commercetools.api.models.search.SearchAnyValueImpl());
    }
}
