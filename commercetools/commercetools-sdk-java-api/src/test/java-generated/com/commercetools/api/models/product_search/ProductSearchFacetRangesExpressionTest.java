
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
public class ProductSearchFacetRangesExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetRangesExpressionBuilder builder) {
        ProductSearchFacetRangesExpression productSearchFacetRangesExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetRangesExpression)
                .isInstanceOf(ProductSearchFacetRangesExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetRangesExpression.builder()
                .ranges(new com.commercetools.api.models.product_search.ProductSearchFacetRangesValueImpl()) } };
    }

    @Test
    public void ranges() {
        ProductSearchFacetRangesExpression value = ProductSearchFacetRangesExpression.of();
        value.setRanges(new com.commercetools.api.models.product_search.ProductSearchFacetRangesValueImpl());
        Assertions.assertThat(value.getRanges())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFacetRangesValueImpl());
    }
}
