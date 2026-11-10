
package com.commercetools.api.models.custom_object;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomObjectPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomObjectPagedQueryResponseBuilder builder) {
        CustomObjectPagedQueryResponse customObjectPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(customObjectPagedQueryResponse).isInstanceOf(CustomObjectPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", CustomObjectPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", CustomObjectPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", CustomObjectPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", CustomObjectPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        CustomObjectPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.custom_object.CustomObjectImpl())) } };
    }

    @Test
    public void limit() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.custom_object.CustomObjectImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.custom_object.CustomObjectImpl()));
    }
}
