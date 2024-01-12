
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
public class ProductSearchFacetDistinctExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetDistinctExpressionBuilder builder) {
        ProductSearchFacetDistinctExpression productSearchFacetDistinctExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetDistinctExpression)
                .isInstanceOf(ProductSearchFacetDistinctExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetDistinctExpression.builder()
                .distinct(new com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueImpl()) } };
    }

    @Test
    public void distinct() {
        ProductSearchFacetDistinctExpression value = ProductSearchFacetDistinctExpression.of();
        value.setDistinct(new com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueImpl());
        Assertions.assertThat(value.getDistinct())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueImpl());
    }
}
