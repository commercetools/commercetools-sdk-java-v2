
package com.commercetools.api.models.state;

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
public class StatePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StatePagedQueryResponseBuilder builder) {
        StatePagedQueryResponse statePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(statePagedQueryResponse).isInstanceOf(StatePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StatePagedQueryResponse.builder().limit(7L) },
                new Object[] { StatePagedQueryResponse.builder().offset(3L) },
                new Object[] { StatePagedQueryResponse.builder().count(2L) },
                new Object[] { StatePagedQueryResponse.builder().total(1L) },
                new Object[] { StatePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.state.StateImpl())) } };
    }

    @Test
    public void limit() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.state.StateImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.state.StateImpl()));
    }
}
