
package com.commercetools.api.models.product_type;

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
public class ProductTypePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypePagedQueryResponseBuilder builder) {
        ProductTypePagedQueryResponse productTypePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productTypePagedQueryResponse).isInstanceOf(ProductTypePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypePagedQueryResponse.builder().limit(7L) },
                new Object[] { ProductTypePagedQueryResponse.builder().offset(3L) },
                new Object[] { ProductTypePagedQueryResponse.builder().count(2L) },
                new Object[] { ProductTypePagedQueryResponse.builder().total(1L) },
                new Object[] { ProductTypePagedQueryResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.product_type.ProductTypeImpl())) } };
    }

    @Test
    public void limit() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.product_type.ProductTypeImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product_type.ProductTypeImpl()));
    }
}
