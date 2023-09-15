
package com.commercetools.api.models.custom_object;

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
public class CustomObjectPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomObjectPagedQueryResponseBuilder builder) {
        CustomObjectPagedQueryResponse customObjectPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(customObjectPagedQueryResponse).isInstanceOf(CustomObjectPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomObjectPagedQueryResponse.builder().limit(7L) },
                new Object[] { CustomObjectPagedQueryResponse.builder().offset(3L) },
                new Object[] { CustomObjectPagedQueryResponse.builder().count(2L) },
                new Object[] { CustomObjectPagedQueryResponse.builder().total(1L) },
                new Object[] { CustomObjectPagedQueryResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.custom_object.CustomObjectImpl())) } };
    }

    @Test
    public void limit() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        CustomObjectPagedQueryResponse value = CustomObjectPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.custom_object.CustomObjectImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.custom_object.CustomObjectImpl()));
    }
}
