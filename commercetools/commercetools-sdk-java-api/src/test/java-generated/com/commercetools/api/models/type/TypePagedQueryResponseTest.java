
package com.commercetools.api.models.type;

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
public class TypePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypePagedQueryResponseBuilder builder) {
        TypePagedQueryResponse typePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(typePagedQueryResponse).isInstanceOf(TypePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypePagedQueryResponse.builder().limit(7L) },
                new Object[] { TypePagedQueryResponse.builder().offset(3L) },
                new Object[] { TypePagedQueryResponse.builder().count(2L) },
                new Object[] { TypePagedQueryResponse.builder().total(1L) },
                new Object[] { TypePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.type.TypeImpl())) } };
    }

    @Test
    public void limit() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        TypePagedQueryResponse value = TypePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.type.TypeImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.TypeImpl()));
    }
}
