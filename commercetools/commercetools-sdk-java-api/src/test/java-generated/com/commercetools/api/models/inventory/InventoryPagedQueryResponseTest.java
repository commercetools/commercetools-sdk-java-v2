
package com.commercetools.api.models.inventory;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class InventoryPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InventoryPagedQueryResponseBuilder builder) {
        InventoryPagedQueryResponse inventoryPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(inventoryPagedQueryResponse).isInstanceOf(InventoryPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InventoryPagedQueryResponse.builder().limit(7L) },
                new Object[] { InventoryPagedQueryResponse.builder().offset(3L) },
                new Object[] { InventoryPagedQueryResponse.builder().count(2L) },
                new Object[] { InventoryPagedQueryResponse.builder().total(1L) },
                new Object[] { InventoryPagedQueryResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.inventory.InventoryEntryImpl())) } };
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
