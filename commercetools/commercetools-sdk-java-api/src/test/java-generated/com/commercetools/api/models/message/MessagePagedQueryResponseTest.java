
package com.commercetools.api.models.message;

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
public class MessagePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MessagePagedQueryResponseBuilder builder) {
        MessagePagedQueryResponse messagePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(messagePagedQueryResponse).isInstanceOf(MessagePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MessagePagedQueryResponse.builder().limit(7L) },
                new Object[] { MessagePagedQueryResponse.builder().count(2L) },
                new Object[] { MessagePagedQueryResponse.builder().total(1L) },
                new Object[] { MessagePagedQueryResponse.builder().offset(3L) },
                new Object[] { MessagePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.message.MessageImpl())) } };
    }

    @Test
    public void limit() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.message.MessageImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.message.MessageImpl()));
    }
}
