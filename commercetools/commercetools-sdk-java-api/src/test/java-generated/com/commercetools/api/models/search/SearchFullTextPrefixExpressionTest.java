
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
public class SearchFullTextPrefixExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchFullTextPrefixExpressionBuilder builder) {
        SearchFullTextPrefixExpression searchFullTextPrefixExpression = builder.buildUnchecked();
        Assertions.assertThat(searchFullTextPrefixExpression).isInstanceOf(SearchFullTextPrefixExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchFullTextPrefixExpression.builder()
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
