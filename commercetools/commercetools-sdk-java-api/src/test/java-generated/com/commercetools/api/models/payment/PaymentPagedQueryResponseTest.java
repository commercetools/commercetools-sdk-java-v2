
package com.commercetools.api.models.payment;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentPagedQueryResponseBuilder builder) {
        PaymentPagedQueryResponse paymentPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(paymentPagedQueryResponse).isInstanceOf(PaymentPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", PaymentPagedQueryResponse.builder().limit(7L) },
                new Object[] { "count", PaymentPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", PaymentPagedQueryResponse.builder().total(1L) },
                new Object[] { "offset", PaymentPagedQueryResponse.builder().offset(3L) },
                new Object[] { "results", PaymentPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.payment.PaymentImpl())) } };
    }

    @Test
    public void limit() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        PaymentPagedQueryResponse value = PaymentPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.payment.PaymentImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.PaymentImpl()));
    }
}
