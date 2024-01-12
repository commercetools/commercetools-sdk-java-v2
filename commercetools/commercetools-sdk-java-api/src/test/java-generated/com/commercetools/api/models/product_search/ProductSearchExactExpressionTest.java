
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
public class ProductSearchExactExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchExactExpressionBuilder builder) {
        ProductSearchExactExpression productSearchExactExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchExactExpression).isInstanceOf(ProductSearchExactExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchExactExpression.builder()
                .exact(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl()) } };
    }

    @Test
    public void exact() {
        ProductSearchExactExpression value = ProductSearchExactExpression.of();
        value.setExact(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl());
        Assertions.assertThat(value.getExact())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl());
    }
}
