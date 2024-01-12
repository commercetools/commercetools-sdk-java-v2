
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
public class ProductSearchWildCardExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchWildCardExpressionBuilder builder) {
        ProductSearchWildCardExpression productSearchWildCardExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchWildCardExpression).isInstanceOf(ProductSearchWildCardExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchWildCardExpression.builder()
                .wildcard(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl()) } };
    }

    @Test
    public void wildcard() {
        ProductSearchWildCardExpression value = ProductSearchWildCardExpression.of();
        value.setWildcard(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl());
        Assertions.assertThat(value.getWildcard())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchAnyValueImpl());
    }
}
