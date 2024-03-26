
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
public class SearchExistsExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchExistsExpressionBuilder builder) {
        SearchExistsExpression searchExistsExpression = builder.buildUnchecked();
        Assertions.assertThat(searchExistsExpression).isInstanceOf(SearchExistsExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchExistsExpression.builder()
                .exists(new com.commercetools.api.models.search.SearchExistsValueImpl()) } };
    }

    @Test
    public void exists() {
        SearchExistsExpression value = SearchExistsExpression.of();
        value.setExists(new com.commercetools.api.models.search.SearchExistsValueImpl());
        Assertions.assertThat(value.getExists())
                .isEqualTo(new com.commercetools.api.models.search.SearchExistsValueImpl());
    }
}
