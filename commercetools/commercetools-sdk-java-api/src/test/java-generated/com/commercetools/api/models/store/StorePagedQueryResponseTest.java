
package com.commercetools.api.models.store;

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
public class StorePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StorePagedQueryResponseBuilder builder) {
        StorePagedQueryResponse storePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(storePagedQueryResponse).isInstanceOf(StorePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StorePagedQueryResponse.builder().limit(7L) },
                new Object[] { StorePagedQueryResponse.builder().offset(3L) },
                new Object[] { StorePagedQueryResponse.builder().count(2L) },
                new Object[] { StorePagedQueryResponse.builder().total(1L) },
                new Object[] { StorePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.store.StoreImpl())) } };
    }

    @Test
    public void limit() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.store.StoreImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreImpl()));
    }
}
