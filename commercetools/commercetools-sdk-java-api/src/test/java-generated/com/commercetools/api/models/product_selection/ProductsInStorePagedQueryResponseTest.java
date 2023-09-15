
package com.commercetools.api.models.product_selection;

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
public class ProductsInStorePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductsInStorePagedQueryResponseBuilder builder) {
        ProductsInStorePagedQueryResponse productsInStorePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productsInStorePagedQueryResponse).isInstanceOf(ProductsInStorePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductsInStorePagedQueryResponse.builder().limit(7L) },
                new Object[] { ProductsInStorePagedQueryResponse.builder().offset(3L) },
                new Object[] { ProductsInStorePagedQueryResponse.builder().count(2L) },
                new Object[] { ProductsInStorePagedQueryResponse.builder().total(1L) },
                new Object[] { ProductsInStorePagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_selection.ProductSelectionAssignmentImpl())) } };
    }

    @Test
    public void limit() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setResults(Collections
                .singletonList(new com.commercetools.api.models.product_selection.ProductSelectionAssignmentImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_selection.ProductSelectionAssignmentImpl()));
    }
}
