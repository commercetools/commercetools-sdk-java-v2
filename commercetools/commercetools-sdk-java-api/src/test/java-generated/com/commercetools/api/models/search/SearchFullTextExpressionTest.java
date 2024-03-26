
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
public class SearchFullTextExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchFullTextExpressionBuilder builder) {
        SearchFullTextExpression searchFullTextExpression = builder.buildUnchecked();
        Assertions.assertThat(searchFullTextExpression).isInstanceOf(SearchFullTextExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchFullTextExpression.builder()
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
