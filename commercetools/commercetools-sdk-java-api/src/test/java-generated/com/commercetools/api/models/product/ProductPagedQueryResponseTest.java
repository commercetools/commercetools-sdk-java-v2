
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
public class ProductPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPagedQueryResponseBuilder builder) {
        ProductPagedQueryResponse productPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productPagedQueryResponse).isInstanceOf(ProductPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPagedQueryResponse.builder().limit(7L) },
                new Object[] { ProductPagedQueryResponse.builder().offset(3L) },
                new Object[] { ProductPagedQueryResponse.builder().count(2L) },
                new Object[] { ProductPagedQueryResponse.builder().total(1L) },
                new Object[] { ProductPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.product.ProductImpl())) } };
    }

    @Test
    public void limit() {
        ProductPagedQueryResponse value = ProductPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductPagedQueryResponse value = ProductPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductPagedQueryResponse value = ProductPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductPagedQueryResponse value = ProductPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductPagedQueryResponse value = ProductPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.product.ProductImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.ProductImpl()));
    }
}
