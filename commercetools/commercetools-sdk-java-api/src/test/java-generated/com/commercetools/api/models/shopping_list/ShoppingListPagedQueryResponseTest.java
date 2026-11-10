
package com.commercetools.api.models.shopping_list;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListPagedQueryResponseBuilder builder) {
        ShoppingListPagedQueryResponse shoppingListPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(shoppingListPagedQueryResponse).isInstanceOf(ShoppingListPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ShoppingListPagedQueryResponse.builder().limit(7L) },
                new Object[] { "count", ShoppingListPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ShoppingListPagedQueryResponse.builder().total(1L) },
                new Object[] { "offset", ShoppingListPagedQueryResponse.builder().offset(3L) },
                new Object[] { "results",
                        ShoppingListPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.shopping_list.ShoppingListImpl())) } };
    }

    @Test
    public void limit() {
        ShoppingListPagedQueryResponse value = ShoppingListPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        ShoppingListPagedQueryResponse value = ShoppingListPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ShoppingListPagedQueryResponse value = ShoppingListPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        ShoppingListPagedQueryResponse value = ShoppingListPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        ShoppingListPagedQueryResponse value = ShoppingListPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.shopping_list.ShoppingListImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.shopping_list.ShoppingListImpl()));
    }
}
