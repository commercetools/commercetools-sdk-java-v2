
package com.commercetools.api.models.payment_method;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodPagedQueryResponseBuilder builder) {
        PaymentMethodPagedQueryResponse paymentMethodPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodPagedQueryResponse).isInstanceOf(PaymentMethodPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", PaymentMethodPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", PaymentMethodPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", PaymentMethodPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", PaymentMethodPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        PaymentMethodPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.payment_method.PaymentMethodImpl())) } };
    }

    @Test
    public void limit() {
        PaymentMethodPagedQueryResponse value = PaymentMethodPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        PaymentMethodPagedQueryResponse value = PaymentMethodPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        PaymentMethodPagedQueryResponse value = PaymentMethodPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        PaymentMethodPagedQueryResponse value = PaymentMethodPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        PaymentMethodPagedQueryResponse value = PaymentMethodPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.payment_method.PaymentMethodImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.payment_method.PaymentMethodImpl()));
    }
}
