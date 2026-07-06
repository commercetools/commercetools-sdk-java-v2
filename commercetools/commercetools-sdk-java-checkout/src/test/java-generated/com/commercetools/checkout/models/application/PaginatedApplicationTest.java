
package com.commercetools.checkout.models.application;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaginatedApplicationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaginatedApplicationBuilder builder) {
        PaginatedApplication paginatedApplication = builder.buildUnchecked();
        Assertions.assertThat(paginatedApplication).isInstanceOf(PaginatedApplication.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", PaginatedApplication.builder().limit(7) },
                new Object[] { "offset", PaginatedApplication.builder().offset(3) },
                new Object[] { "count", PaginatedApplication.builder().count(2) },
                new Object[] { "total", PaginatedApplication.builder().total(1) },
                new Object[] { "results",
                        PaginatedApplication.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.checkout.models.application.ApplicationImpl())) } };
    }

    @Test
    public void limit() {
        PaginatedApplication value = PaginatedApplication.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        PaginatedApplication value = PaginatedApplication.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void count() {
        PaginatedApplication value = PaginatedApplication.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }

    @Test
    public void total() {
        PaginatedApplication value = PaginatedApplication.of();
        value.setTotal(1);
        Assertions.assertThat(value.getTotal()).isEqualTo(1);
    }

    @Test
    public void results() {
        PaginatedApplication value = PaginatedApplication.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.checkout.models.application.ApplicationImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.checkout.models.application.ApplicationImpl()));
    }
}
