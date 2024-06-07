
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
public class ProductSearchFacetCountExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetCountExpressionBuilder builder) {
        ProductSearchFacetCountExpression productSearchFacetCountExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetCountExpression).isInstanceOf(ProductSearchFacetCountExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetCountExpression.builder()
                .count(new com.commercetools.api.models.product_search.ProductSearchFacetCountValueImpl()) } };
    }

    @Test
    public void count() {
        ProductSearchFacetCountExpression value = ProductSearchFacetCountExpression.of();
        value.setCount(new com.commercetools.api.models.product_search.ProductSearchFacetCountValueImpl());
        Assertions.assertThat(value.getCount())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFacetCountValueImpl());
    }
}
