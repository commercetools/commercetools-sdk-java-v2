
package com.commercetools.importapi.models.importoperations;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportOperationPagedResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportOperationPagedResponseBuilder builder) {
        ImportOperationPagedResponse importOperationPagedResponse = builder.buildUnchecked();
        Assertions.assertThat(importOperationPagedResponse).isInstanceOf(ImportOperationPagedResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ImportOperationPagedResponse.builder().limit(7) },
                new Object[] { "offset", ImportOperationPagedResponse.builder().offset(3L) },
                new Object[] { "count", ImportOperationPagedResponse.builder().count(2L) },
                new Object[] { "total", ImportOperationPagedResponse.builder().total(1L) },
                new Object[] { "results",
                        ImportOperationPagedResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.importapi.models.importoperations.ImportOperationImpl())) } };
    }

    @Test
    public void limit() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.importapi.models.importoperations.ImportOperationImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.importoperations.ImportOperationImpl()));
    }
}
