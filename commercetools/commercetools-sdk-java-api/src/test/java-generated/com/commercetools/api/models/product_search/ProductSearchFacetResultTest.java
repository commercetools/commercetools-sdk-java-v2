
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
public class ProductSearchFacetResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetResultBuilder builder) {
        ProductSearchFacetResult productSearchFacetResult = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResult).isInstanceOf(ProductSearchFacetResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetResult.builder()
                .results(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionImpl())) } };
    }

    @Test
    public void results() {
        ProductSearchFacetResult value = ProductSearchFacetResult.of();
        value.setResults(Collections.singletonList(
            new com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionImpl()));
    }
}
