
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
public class ProductSearchSuggestionCompletionExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchSuggestionCompletionExpressionBuilder builder) {
        ProductSearchSuggestionCompletionExpression productSearchSuggestionCompletionExpression = builder
                .buildUnchecked();
        Assertions.assertThat(productSearchSuggestionCompletionExpression)
                .isInstanceOf(ProductSearchSuggestionCompletionExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchSuggestionCompletionExpression.builder()
                .completion(
                    new com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValueImpl()) } };
    }

    @Test
    public void completion() {
        ProductSearchSuggestionCompletionExpression value = ProductSearchSuggestionCompletionExpression.of();
        value.setCompletion(
            new com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValueImpl());
        Assertions.assertThat(value.getCompletion())
                .isEqualTo(
                    new com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValueImpl());
    }
}
