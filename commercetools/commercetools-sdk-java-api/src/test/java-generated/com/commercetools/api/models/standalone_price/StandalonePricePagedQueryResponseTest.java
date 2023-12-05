
package com.commercetools.api.models.standalone_price;

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
public class StandalonePricePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePricePagedQueryResponseBuilder builder) {
        StandalonePricePagedQueryResponse standalonePricePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(standalonePricePagedQueryResponse).isInstanceOf(StandalonePricePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePricePagedQueryResponse.builder().limit(7L) },
                new Object[] { StandalonePricePagedQueryResponse.builder().offset(3L) },
                new Object[] { StandalonePricePagedQueryResponse.builder().count(2L) },
                new Object[] { StandalonePricePagedQueryResponse.builder().total(1L) },
                new Object[] { StandalonePricePagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.standalone_price.StandalonePriceImpl())) } };
    }

    @Test
    public void limit() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()));
    }
}
