
package com.commercetools.api.models.product_search;

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
public class ProductSearchSuggestionCompletionExpressionValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchSuggestionCompletionExpressionValueBuilder builder) {
        ProductSearchSuggestionCompletionExpressionValue productSearchSuggestionCompletionExpressionValue = builder
                .buildUnchecked();
        Assertions.assertThat(productSearchSuggestionCompletionExpressionValue)
                .isInstanceOf(ProductSearchSuggestionCompletionExpressionValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSearchSuggestionCompletionExpressionValue.builder().name("name") },
                new Object[] { ProductSearchSuggestionCompletionExpressionValue.builder().field("field") },
                new Object[] { ProductSearchSuggestionCompletionExpressionValue.builder().prefix("prefix") } };
    }

    @Test
    public void name() {
        ProductSearchSuggestionCompletionExpressionValue value = ProductSearchSuggestionCompletionExpressionValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void field() {
        ProductSearchSuggestionCompletionExpressionValue value = ProductSearchSuggestionCompletionExpressionValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void prefix() {
        ProductSearchSuggestionCompletionExpressionValue value = ProductSearchSuggestionCompletionExpressionValue.of();
        value.setPrefix("prefix");
        Assertions.assertThat(value.getPrefix()).isEqualTo("prefix");
    }
}
