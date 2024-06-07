
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
public class SearchTimeRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchTimeRangeExpressionBuilder builder) {
        SearchTimeRangeExpression searchTimeRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchTimeRangeExpression).isInstanceOf(SearchTimeRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchTimeRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchTimeRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchTimeRangeExpression value = SearchTimeRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchTimeRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchTimeRangeValueImpl());
    }
}
