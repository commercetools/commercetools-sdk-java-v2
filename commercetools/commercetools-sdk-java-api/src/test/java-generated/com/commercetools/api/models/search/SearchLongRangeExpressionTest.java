
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
public class SearchLongRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchLongRangeExpressionBuilder builder) {
        SearchLongRangeExpression searchLongRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchLongRangeExpression).isInstanceOf(SearchLongRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchLongRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchLongRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchLongRangeExpression value = SearchLongRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchLongRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchLongRangeValueImpl());
    }
}
