
package com.commercetools.api.models.cart_discount;

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
public class CartDiscountPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountPagedQueryResponseBuilder builder) {
        CartDiscountPagedQueryResponse cartDiscountPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountPagedQueryResponse).isInstanceOf(CartDiscountPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountPagedQueryResponse.builder().limit(7L) },
                new Object[] { CartDiscountPagedQueryResponse.builder().offset(3L) },
                new Object[] { CartDiscountPagedQueryResponse.builder().count(2L) },
                new Object[] { CartDiscountPagedQueryResponse.builder().total(1L) },
                new Object[] { CartDiscountPagedQueryResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.cart_discount.CartDiscountImpl())) } };
    }

    @Test
    public void limit() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.cart_discount.CartDiscountImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart_discount.CartDiscountImpl()));
    }
}
