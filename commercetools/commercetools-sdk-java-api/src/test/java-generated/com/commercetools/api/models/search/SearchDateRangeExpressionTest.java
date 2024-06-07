
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
public class SearchDateRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchDateRangeExpressionBuilder builder) {
        SearchDateRangeExpression searchDateRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchDateRangeExpression).isInstanceOf(SearchDateRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchDateRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchDateRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchDateRangeExpression value = SearchDateRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchDateRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchDateRangeValueImpl());
    }
}
