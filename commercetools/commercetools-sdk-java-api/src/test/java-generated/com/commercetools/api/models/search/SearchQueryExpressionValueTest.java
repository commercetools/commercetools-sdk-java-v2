
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
public class SearchQueryExpressionValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchQueryExpressionValueBuilder builder) {
        SearchQueryExpressionValue searchQueryExpressionValue = builder.buildUnchecked();
        Assertions.assertThat(searchQueryExpressionValue).isInstanceOf(SearchQueryExpressionValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchQueryExpressionValue.builder().field("field") },
                new Object[] { SearchQueryExpressionValue.builder().boost(0.8968434466791833) },
                new Object[] { SearchQueryExpressionValue.builder()
                        .fieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean")) } };
    }

    @Test
    public void field() {
        SearchQueryExpressionValue value = SearchQueryExpressionValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void boost() {
        SearchQueryExpressionValue value = SearchQueryExpressionValue.of();
        value.setBoost(0.8968434466791833);
        Assertions.assertThat(value.getBoost()).isEqualTo(0.8968434466791833);
    }

    @Test
    public void fieldType() {
        SearchQueryExpressionValue value = SearchQueryExpressionValue.of();
        value.setFieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
        Assertions.assertThat(value.getFieldType())
                .isEqualTo(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
    }
}
