
package com.commercetools.importapi.models.importcontainers;

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
public class ImportContainerPagedResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportContainerPagedResponseBuilder builder) {
        ImportContainerPagedResponse importContainerPagedResponse = builder.buildUnchecked();
        Assertions.assertThat(importContainerPagedResponse).isInstanceOf(ImportContainerPagedResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportContainerPagedResponse.builder().limit(7) },
                new Object[] { ImportContainerPagedResponse.builder().offset(3L) },
                new Object[] { ImportContainerPagedResponse.builder().count(2L) },
                new Object[] { ImportContainerPagedResponse.builder().total(1L) },
                new Object[] { ImportContainerPagedResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.importapi.models.importcontainers.ImportContainerImpl())) } };
    }

    @Test
    public void limit() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.importapi.models.importcontainers.ImportContainerImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.importcontainers.ImportContainerImpl()));
    }
}
