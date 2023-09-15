
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
public class ProductSelectionPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionPagedQueryResponseBuilder builder) {
        ProductSelectionPagedQueryResponse productSelectionPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productSelectionPagedQueryResponse)
                .isInstanceOf(ProductSelectionPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionPagedQueryResponse.builder().limit(7L) },
                new Object[] { ProductSelectionPagedQueryResponse.builder().offset(3L) },
                new Object[] { ProductSelectionPagedQueryResponse.builder().count(2L) },
                new Object[] { ProductSelectionPagedQueryResponse.builder().total(1L) },
                new Object[] { ProductSelectionPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_selection.ProductSelectionImpl())) } };
    }

    @Test
    public void limit() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.product_selection.ProductSelectionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_selection.ProductSelectionImpl()));
    }
}
