
package com.commercetools.api.models.order_edit;

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
public class OrderEditPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditPagedQueryResponseBuilder builder) {
        OrderEditPagedQueryResponse orderEditPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(orderEditPagedQueryResponse).isInstanceOf(OrderEditPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderEditPagedQueryResponse.builder().limit(7L) },
                new Object[] { OrderEditPagedQueryResponse.builder().offset(3L) },
                new Object[] { OrderEditPagedQueryResponse.builder().count(2L) },
                new Object[] { OrderEditPagedQueryResponse.builder().total(1L) },
                new Object[] { OrderEditPagedQueryResponse.builder()
                        .results(
                            Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditImpl())) } };
    }

    @Test
    public void limit() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditImpl()));
    }
}
