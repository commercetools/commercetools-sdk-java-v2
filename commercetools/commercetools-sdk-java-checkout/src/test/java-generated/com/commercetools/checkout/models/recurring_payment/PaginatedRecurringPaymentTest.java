
package com.commercetools.checkout.models.recurring_payment;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaginatedRecurringPaymentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaginatedRecurringPaymentBuilder builder) {
        PaginatedRecurringPayment paginatedRecurringPayment = builder.buildUnchecked();
        Assertions.assertThat(paginatedRecurringPayment).isInstanceOf(PaginatedRecurringPayment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", PaginatedRecurringPayment.builder().limit(7) },
                new Object[] { "offset", PaginatedRecurringPayment.builder().offset(3) },
                new Object[] { "count", PaginatedRecurringPayment.builder().count(2) },
                new Object[] { "total", PaginatedRecurringPayment.builder().total(1) },
                new Object[] { "results", PaginatedRecurringPayment.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.checkout.models.recurring_payment.RecurringPaymentImpl())) } };
    }

    @Test
    public void limit() {
        PaginatedRecurringPayment value = PaginatedRecurringPayment.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        PaginatedRecurringPayment value = PaginatedRecurringPayment.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void count() {
        PaginatedRecurringPayment value = PaginatedRecurringPayment.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }

    @Test
    public void total() {
        PaginatedRecurringPayment value = PaginatedRecurringPayment.of();
        value.setTotal(1);
        Assertions.assertThat(value.getTotal()).isEqualTo(1);
    }

    @Test
    public void results() {
        PaginatedRecurringPayment value = PaginatedRecurringPayment.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.checkout.models.recurring_payment.RecurringPaymentImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.checkout.models.recurring_payment.RecurringPaymentImpl()));
    }
}
