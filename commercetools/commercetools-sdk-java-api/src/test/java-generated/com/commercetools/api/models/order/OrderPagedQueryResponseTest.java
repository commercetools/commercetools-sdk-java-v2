
package com.commercetools.api.models.order;

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
public class OrderPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderPagedQueryResponseBuilder builder) {
        OrderPagedQueryResponse orderPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(orderPagedQueryResponse).isInstanceOf(OrderPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderPagedQueryResponse.builder().limit(7L) },
                new Object[] { OrderPagedQueryResponse.builder().offset(3L) },
                new Object[] { OrderPagedQueryResponse.builder().count(2L) },
                new Object[] { OrderPagedQueryResponse.builder().total(1L) },
                new Object[] { OrderPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.order.OrderImpl())) } };
    }

    @Test
    public void limit() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.order.OrderImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderImpl()));
    }
}
