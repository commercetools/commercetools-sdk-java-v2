
package com.commercetools.api.models.inventory;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryPagedQueryResponseBuilder builder) {
        InventoryPagedQueryResponse inventoryPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(inventoryPagedQueryResponse).isInstanceOf(InventoryPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", InventoryPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", InventoryPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", InventoryPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", InventoryPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        InventoryPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.inventory.InventoryEntryImpl())) } };
    }

    @Test
    public void limit() {
        InventoryPagedQueryResponse value = InventoryPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        InventoryPagedQueryResponse value = InventoryPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        InventoryPagedQueryResponse value = InventoryPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        InventoryPagedQueryResponse value = InventoryPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        InventoryPagedQueryResponse value = InventoryPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.inventory.InventoryEntryImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.inventory.InventoryEntryImpl()));
    }
}
