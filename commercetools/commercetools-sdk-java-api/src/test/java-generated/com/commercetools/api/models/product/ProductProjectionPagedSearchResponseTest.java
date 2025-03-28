
package com.commercetools.api.models.product;

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
public class ProductProjectionPagedSearchResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductProjectionPagedSearchResponseBuilder builder) {
        ProductProjectionPagedSearchResponse productProjectionPagedSearchResponse = builder.buildUnchecked();
        Assertions.assertThat(productProjectionPagedSearchResponse)
                .isInstanceOf(ProductProjectionPagedSearchResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductProjectionPagedSearchResponse.builder().limit(7L) },
                new Object[] { ProductProjectionPagedSearchResponse.builder().offset(3L) },
                new Object[] { ProductProjectionPagedSearchResponse.builder().count(2L) },
                new Object[] { ProductProjectionPagedSearchResponse.builder().total(1L) },
                new Object[] { ProductProjectionPagedSearchResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.product.ProductProjectionImpl())) },
                new Object[] { ProductProjectionPagedSearchResponse.builder()
                        .facets(new com.commercetools.api.models.product.FacetResultsImpl()) } };
    }

    @Test
    public void limit() {
        ProductProjectionPagedSearchResponse value = ProductProjectionPagedSearchResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductProjectionPagedSearchResponse value = ProductProjectionPagedSearchResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductProjectionPagedSearchResponse value = ProductProjectionPagedSearchResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductProjectionPagedSearchResponse value = ProductProjectionPagedSearchResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductProjectionPagedSearchResponse value = ProductProjectionPagedSearchResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.product.ProductProjectionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.ProductProjectionImpl()));
    }

    @Test
    public void facets() {
        ProductProjectionPagedSearchResponse value = ProductProjectionPagedSearchResponse.of();
        value.setFacets(new com.commercetools.api.models.product.FacetResultsImpl());
        Assertions.assertThat(value.getFacets()).isEqualTo(new com.commercetools.api.models.product.FacetResultsImpl());
    }
}
