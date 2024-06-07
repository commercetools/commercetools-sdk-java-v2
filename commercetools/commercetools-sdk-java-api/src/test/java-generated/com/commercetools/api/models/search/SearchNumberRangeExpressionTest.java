
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
public class SearchNumberRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchNumberRangeExpressionBuilder builder) {
        SearchNumberRangeExpression searchNumberRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(searchNumberRangeExpression).isInstanceOf(SearchNumberRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchNumberRangeExpression.builder()
                .range(new com.commercetools.api.models.search.SearchNumberRangeValueImpl()) } };
    }

    @Test
    public void range() {
        SearchNumberRangeExpression value = SearchNumberRangeExpression.of();
        value.setRange(new com.commercetools.api.models.search.SearchNumberRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.search.SearchNumberRangeValueImpl());
    }
}
