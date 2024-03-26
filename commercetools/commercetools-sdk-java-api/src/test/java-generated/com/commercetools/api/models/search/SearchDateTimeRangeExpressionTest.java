
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
public class SearchDateTimeRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchDateTimeRangeExpressionBuilder builder) {
        SearchDateTimeRangeExpression searchDateTimeRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchDateTimeRangeExpression).isInstanceOf(SearchDateTimeRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchDateTimeRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchDateTimeRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchDateTimeRangeExpression value = SearchDateTimeRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchDateTimeRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchDateTimeRangeValueImpl());
    }
}
