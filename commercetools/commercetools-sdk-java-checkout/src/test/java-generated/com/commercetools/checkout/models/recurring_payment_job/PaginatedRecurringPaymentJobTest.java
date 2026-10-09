
package com.commercetools.checkout.models.recurring_payment_job;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaginatedRecurringPaymentJobTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaginatedRecurringPaymentJobBuilder builder) {
        PaginatedRecurringPaymentJob paginatedRecurringPaymentJob = builder.buildUnchecked();
        Assertions.assertThat(paginatedRecurringPaymentJob).isInstanceOf(PaginatedRecurringPaymentJob.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", PaginatedRecurringPaymentJob.builder().limit(7) },
                new Object[] { "offset", PaginatedRecurringPaymentJob.builder().offset(3) },
                new Object[] { "count", PaginatedRecurringPaymentJob.builder().count(2) },
                new Object[] { "total", PaginatedRecurringPaymentJob.builder().total(1) },
                new Object[] { "results", PaginatedRecurringPaymentJob.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobImpl())) } };
    }

    @Test
    public void limit() {
        PaginatedRecurringPaymentJob value = PaginatedRecurringPaymentJob.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        PaginatedRecurringPaymentJob value = PaginatedRecurringPaymentJob.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void count() {
        PaginatedRecurringPaymentJob value = PaginatedRecurringPaymentJob.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }

    @Test
    public void total() {
        PaginatedRecurringPaymentJob value = PaginatedRecurringPaymentJob.of();
        value.setTotal(1);
        Assertions.assertThat(value.getTotal()).isEqualTo(1);
    }

    @Test
    public void results() {
        PaginatedRecurringPaymentJob value = PaginatedRecurringPaymentJob.of();
        value.setResults(Collections
                .singletonList(new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobImpl()));
    }
}
