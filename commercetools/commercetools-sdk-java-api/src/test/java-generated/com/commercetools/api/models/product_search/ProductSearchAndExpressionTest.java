
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
public class ProductSearchAndExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchAndExpressionBuilder builder) {
        ProductSearchAndExpression productSearchAndExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchAndExpression).isInstanceOf(ProductSearchAndExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchAndExpression.builder()
                .and(Collections
                        .singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl())) } };
    }

    @Test
    public void and() {
        ProductSearchAndExpression value = ProductSearchAndExpression.of();
        value.setAnd(
            Collections.singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()));
        Assertions.assertThat(value.getAnd())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()));
    }
}
