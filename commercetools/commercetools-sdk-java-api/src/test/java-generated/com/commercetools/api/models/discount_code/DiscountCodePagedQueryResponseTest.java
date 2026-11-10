
package com.commercetools.api.models.discount_code;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodePagedQueryResponseBuilder builder) {
        DiscountCodePagedQueryResponse discountCodePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(discountCodePagedQueryResponse).isInstanceOf(DiscountCodePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", DiscountCodePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", DiscountCodePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", DiscountCodePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", DiscountCodePagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        DiscountCodePagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.discount_code.DiscountCodeImpl())) } };
    }

    @Test
    public void limit() {
        DiscountCodePagedQueryResponse value = DiscountCodePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        DiscountCodePagedQueryResponse value = DiscountCodePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        DiscountCodePagedQueryResponse value = DiscountCodePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        DiscountCodePagedQueryResponse value = DiscountCodePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        DiscountCodePagedQueryResponse value = DiscountCodePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.discount_code.DiscountCodeImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.discount_code.DiscountCodeImpl()));
    }
}
