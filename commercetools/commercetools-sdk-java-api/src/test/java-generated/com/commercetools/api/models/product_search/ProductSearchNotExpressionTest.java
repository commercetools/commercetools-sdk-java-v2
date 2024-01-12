
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
public class ProductSearchNotExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchNotExpressionBuilder builder) {
        ProductSearchNotExpression productSearchNotExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchNotExpression).isInstanceOf(ProductSearchNotExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchNotExpression.builder()
                .not(Collections
                        .singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl())) } };
    }

    @Test
    public void not() {
        ProductSearchNotExpression value = ProductSearchNotExpression.of();
        value.setNot(
            Collections.singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()));
        Assertions.assertThat(value.getNot())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()));
    }
}
