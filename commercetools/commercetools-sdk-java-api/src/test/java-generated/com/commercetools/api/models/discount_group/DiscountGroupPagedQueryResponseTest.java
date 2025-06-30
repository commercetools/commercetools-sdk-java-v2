
package com.commercetools.api.models.discount_group;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupPagedQueryResponseBuilder builder) {
        DiscountGroupPagedQueryResponse discountGroupPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(discountGroupPagedQueryResponse).isInstanceOf(DiscountGroupPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", DiscountGroupPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", DiscountGroupPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", DiscountGroupPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", DiscountGroupPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        DiscountGroupPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.discount_group.DiscountGroupImpl())) } };
    }

    @Test
    public void limit() {
        DiscountGroupPagedQueryResponse value = DiscountGroupPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        DiscountGroupPagedQueryResponse value = DiscountGroupPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        DiscountGroupPagedQueryResponse value = DiscountGroupPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        DiscountGroupPagedQueryResponse value = DiscountGroupPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        DiscountGroupPagedQueryResponse value = DiscountGroupPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.discount_group.DiscountGroupImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.discount_group.DiscountGroupImpl()));
    }
}
