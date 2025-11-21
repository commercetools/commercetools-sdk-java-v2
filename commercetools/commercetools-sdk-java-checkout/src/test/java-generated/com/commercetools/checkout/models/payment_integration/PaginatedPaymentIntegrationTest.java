
package com.commercetools.checkout.models.payment_integration;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaginatedPaymentIntegrationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaginatedPaymentIntegrationBuilder builder) {
        PaginatedPaymentIntegration paginatedPaymentIntegration = builder.buildUnchecked();
        Assertions.assertThat(paginatedPaymentIntegration).isInstanceOf(PaginatedPaymentIntegration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", PaginatedPaymentIntegration.builder().limit(7) },
                new Object[] { "offset", PaginatedPaymentIntegration.builder().offset(3) },
                new Object[] { "count", PaginatedPaymentIntegration.builder().count(2) },
                new Object[] { "total", PaginatedPaymentIntegration.builder().total(1) },
                new Object[] { "results", PaginatedPaymentIntegration.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.checkout.models.payment_integration.PaymentIntegrationImpl())) } };
    }

    @Test
    public void limit() {
        PaginatedPaymentIntegration value = PaginatedPaymentIntegration.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        PaginatedPaymentIntegration value = PaginatedPaymentIntegration.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void count() {
        PaginatedPaymentIntegration value = PaginatedPaymentIntegration.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }

    @Test
    public void total() {
        PaginatedPaymentIntegration value = PaginatedPaymentIntegration.of();
        value.setTotal(1);
        Assertions.assertThat(value.getTotal()).isEqualTo(1);
    }

    @Test
    public void results() {
        PaginatedPaymentIntegration value = PaginatedPaymentIntegration.of();
        value.setResults(Collections
                .singletonList(new com.commercetools.checkout.models.payment_integration.PaymentIntegrationImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.payment_integration.PaymentIntegrationImpl()));
    }
}
