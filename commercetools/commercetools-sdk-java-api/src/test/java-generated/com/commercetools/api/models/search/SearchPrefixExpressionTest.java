
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
public class SearchPrefixExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchPrefixExpressionBuilder builder) {
        SearchPrefixExpression searchPrefixExpression = builder.buildUnchecked();
        Assertions.assertThat(searchPrefixExpression).isInstanceOf(SearchPrefixExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchPrefixExpression.builder()
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
