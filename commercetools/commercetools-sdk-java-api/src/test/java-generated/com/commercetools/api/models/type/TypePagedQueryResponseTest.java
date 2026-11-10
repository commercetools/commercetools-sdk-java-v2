
package com.commercetools.api.models.type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypePagedQueryResponseBuilder builder) {
        TypePagedQueryResponse typePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(typePagedQueryResponse).isInstanceOf(TypePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", TypePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", TypePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", TypePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", TypePagedQueryResponse.builder().total(1L) },
                new Object[] { "results", TypePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.type.TypeImpl())) } };
    }

    @Test
    public void limit() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.type.TypeImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.TypeImpl()));
    }
}
