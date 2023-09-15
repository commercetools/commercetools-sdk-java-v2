
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountPagedQueryResponseBuilder builder) {
        ProductDiscountPagedQueryResponse productDiscountPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productDiscountPagedQueryResponse).isInstanceOf(ProductDiscountPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountPagedQueryResponse.builder().limit(7L) },
                new Object[] { ProductDiscountPagedQueryResponse.builder().offset(3L) },
                new Object[] { ProductDiscountPagedQueryResponse.builder().count(2L) },
                new Object[] { ProductDiscountPagedQueryResponse.builder().total(1L) },
                new Object[] { ProductDiscountPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_discount.ProductDiscountImpl())) } };
    }

    @Test
    public void limit() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.product_discount.ProductDiscountImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.product_discount.ProductDiscountImpl()));
    }
}
