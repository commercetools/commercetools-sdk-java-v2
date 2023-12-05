
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
public class ProductProjectionPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductProjectionPagedQueryResponseBuilder builder) {
        ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productProjectionPagedQueryResponse)
                .isInstanceOf(ProductProjectionPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductProjectionPagedQueryResponse.builder().limit(7L) },
                new Object[] { ProductProjectionPagedQueryResponse.builder().count(2L) },
                new Object[] { ProductProjectionPagedQueryResponse.builder().total(1L) },
                new Object[] { ProductProjectionPagedQueryResponse.builder().offset(3L) },
                new Object[] { ProductProjectionPagedQueryResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.product.ProductProjectionImpl())) } };
    }

    @Test
    public void limit() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.product.ProductProjectionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.ProductProjectionImpl()));
    }
}
