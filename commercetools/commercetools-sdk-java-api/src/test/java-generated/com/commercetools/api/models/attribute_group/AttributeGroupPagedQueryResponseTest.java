
package com.commercetools.api.models.attribute_group;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupPagedQueryResponseBuilder builder) {
        AttributeGroupPagedQueryResponse attributeGroupPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupPagedQueryResponse).isInstanceOf(AttributeGroupPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", AttributeGroupPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", AttributeGroupPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", AttributeGroupPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", AttributeGroupPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        AttributeGroupPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.attribute_group.AttributeGroupImpl())) } };
    }

    @Test
    public void limit() {
        AttributeGroupPagedQueryResponse value = AttributeGroupPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        AttributeGroupPagedQueryResponse value = AttributeGroupPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        AttributeGroupPagedQueryResponse value = AttributeGroupPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        AttributeGroupPagedQueryResponse value = AttributeGroupPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        AttributeGroupPagedQueryResponse value = AttributeGroupPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.attribute_group.AttributeGroupImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.attribute_group.AttributeGroupImpl()));
    }
}
