
package com.commercetools.api.models.product_search;

import java.util.Collections;

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
public class ProductSearchOrExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchOrExpressionBuilder builder) {
        ProductSearchOrExpression productSearchOrExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchOrExpression).isInstanceOf(ProductSearchOrExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchOrExpression.builder()
                .or(Collections
                        .singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl())) } };
    }

    @Test
    public void or() {
        ProductSearchOrExpression value = ProductSearchOrExpression.of();
        value.setOr(
            Collections.singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()));
        Assertions.assertThat(value.getOr())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()));
    }
}
