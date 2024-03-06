
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringPagedQueryResponseBuilder builder) {
        ProductTailoringPagedQueryResponse productTailoringPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productTailoringPagedQueryResponse)
                .isInstanceOf(ProductTailoringPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringPagedQueryResponse.builder().limit(7L) },
                new Object[] { ProductTailoringPagedQueryResponse.builder().offset(3L) },
                new Object[] { ProductTailoringPagedQueryResponse.builder().count(2L) },
                new Object[] { ProductTailoringPagedQueryResponse.builder().total(1L) },
                new Object[] { ProductTailoringPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductTailoringImpl())) } };
    }

    @Test
    public void limit() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl()));
    }
}
