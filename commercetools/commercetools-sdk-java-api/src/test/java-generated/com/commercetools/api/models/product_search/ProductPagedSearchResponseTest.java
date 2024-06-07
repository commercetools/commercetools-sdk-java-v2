
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
public class ProductPagedSearchResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPagedSearchResponseBuilder builder) {
        ProductPagedSearchResponse productPagedSearchResponse = builder.buildUnchecked();
        Assertions.assertThat(productPagedSearchResponse).isInstanceOf(ProductPagedSearchResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPagedSearchResponse.builder().total(1L) },
                new Object[] { ProductPagedSearchResponse.builder().offset(3) },
                new Object[] { ProductPagedSearchResponse.builder().limit(7) },
                new Object[] { ProductPagedSearchResponse.builder()
                        .facets(Collections.singletonList(
                            new com.commercetools.api.models.product_search.ProductSearchFacetResultImpl())) },
                new Object[] { ProductPagedSearchResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_search.ProductSearchResultImpl())) } };
    }

    @Test
    public void total() {
        ProductPagedSearchResponse value = ProductPagedSearchResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        ProductPagedSearchResponse value = ProductPagedSearchResponse.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void limit() {
        ProductPagedSearchResponse value = ProductPagedSearchResponse.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void facets() {
        ProductPagedSearchResponse value = ProductPagedSearchResponse.of();
        value.setFacets(
            Collections.singletonList(new com.commercetools.api.models.product_search.ProductSearchFacetResultImpl()));
        Assertions.assertThat(value.getFacets())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_search.ProductSearchFacetResultImpl()));
    }

    @Test
    public void results() {
        ProductPagedSearchResponse value = ProductPagedSearchResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.product_search.ProductSearchResultImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_search.ProductSearchResultImpl()));
    }
}
