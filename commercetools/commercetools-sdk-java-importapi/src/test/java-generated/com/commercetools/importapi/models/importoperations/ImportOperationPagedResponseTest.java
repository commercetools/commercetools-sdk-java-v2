
package com.commercetools.importapi.models.importoperations;

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
public class ImportOperationPagedResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportOperationPagedResponseBuilder builder) {
        ImportOperationPagedResponse importOperationPagedResponse = builder.buildUnchecked();
        Assertions.assertThat(importOperationPagedResponse).isInstanceOf(ImportOperationPagedResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportOperationPagedResponse.builder().limit(7) },
                new Object[] { ImportOperationPagedResponse.builder().offset(3L) },
                new Object[] { ImportOperationPagedResponse.builder().count(2L) },
                new Object[] { ImportOperationPagedResponse.builder().total(1L) },
                new Object[] { ImportOperationPagedResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.importapi.models.importoperations.ImportOperationImpl())) } };
    }

    @Test
    public void limit() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ImportOperationPagedResponse value = ImportOperationPagedResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.importapi.models.importoperations.ImportOperationImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.importoperations.ImportOperationImpl()));
    }
}
