
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
public class ProductSelectionProductPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionProductPagedQueryResponseBuilder builder) {
        ProductSelectionProductPagedQueryResponse productSelectionProductPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productSelectionProductPagedQueryResponse)
                .isInstanceOf(ProductSelectionProductPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionProductPagedQueryResponse.builder().limit(7L) },
                new Object[] { ProductSelectionProductPagedQueryResponse.builder().offset(3L) },
                new Object[] { ProductSelectionProductPagedQueryResponse.builder().count(2L) },
                new Object[] { ProductSelectionProductPagedQueryResponse.builder().total(1L) },
                new Object[] { ProductSelectionProductPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_selection.AssignedProductReferenceImpl())) } };
    }

    @Test
    public void limit() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setResults(Collections
                .singletonList(new com.commercetools.api.models.product_selection.AssignedProductReferenceImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_selection.AssignedProductReferenceImpl()));
    }
}
