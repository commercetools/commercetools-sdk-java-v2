
package com.commercetools.api.models.category;

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
public class CategoryPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryPagedQueryResponseBuilder builder) {
        CategoryPagedQueryResponse categoryPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(categoryPagedQueryResponse).isInstanceOf(CategoryPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryPagedQueryResponse.builder().limit(7L) },
                new Object[] { CategoryPagedQueryResponse.builder().offset(3L) },
                new Object[] { CategoryPagedQueryResponse.builder().count(2L) },
                new Object[] { CategoryPagedQueryResponse.builder().total(1L) },
                new Object[] { CategoryPagedQueryResponse.builder()
                        .results(
                            Collections.singletonList(new com.commercetools.api.models.category.CategoryImpl())) } };
    }

    @Test
    public void limit() {
        CategoryPagedQueryResponse value = CategoryPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        CategoryPagedQueryResponse value = CategoryPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        CategoryPagedQueryResponse value = CategoryPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        CategoryPagedQueryResponse value = CategoryPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        CategoryPagedQueryResponse value = CategoryPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.category.CategoryImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.category.CategoryImpl()));
    }
}
