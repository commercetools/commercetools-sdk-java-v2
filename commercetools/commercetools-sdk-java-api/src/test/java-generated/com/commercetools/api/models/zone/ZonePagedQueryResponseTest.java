
package com.commercetools.api.models.zone;

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
public class ZonePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZonePagedQueryResponseBuilder builder) {
        ZonePagedQueryResponse zonePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(zonePagedQueryResponse).isInstanceOf(ZonePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ZonePagedQueryResponse.builder().limit(7L) },
                new Object[] { ZonePagedQueryResponse.builder().offset(3L) },
                new Object[] { ZonePagedQueryResponse.builder().count(2L) },
                new Object[] { ZonePagedQueryResponse.builder().total(1L) },
                new Object[] { ZonePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.zone.ZoneImpl())) } };
    }

    @Test
    public void limit() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.zone.ZoneImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.zone.ZoneImpl()));
    }
}
