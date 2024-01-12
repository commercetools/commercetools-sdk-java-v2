
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
public class ProductSearchPrefixExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchPrefixExpressionBuilder builder) {
        ProductSearchPrefixExpression productSearchPrefixExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchPrefixExpression).isInstanceOf(ProductSearchPrefixExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchPrefixExpression.builder()
                .prefix(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl()) } };
    }

    @Test
    public void prefix() {
        ProductSearchPrefixExpression value = ProductSearchPrefixExpression.of();
        value.setPrefix(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl());
        Assertions.assertThat(value.getPrefix())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl());
    }
}
