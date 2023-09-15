
package com.commercetools.api.models.channel;

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
public class ChannelPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChannelPagedQueryResponseBuilder builder) {
        ChannelPagedQueryResponse channelPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(channelPagedQueryResponse).isInstanceOf(ChannelPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChannelPagedQueryResponse.builder().limit(7L) },
                new Object[] { ChannelPagedQueryResponse.builder().offset(3L) },
                new Object[] { ChannelPagedQueryResponse.builder().count(2L) },
                new Object[] { ChannelPagedQueryResponse.builder().total(1L) },
                new Object[] { ChannelPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.channel.ChannelImpl())) } };
    }

    @Test
    public void limit() {
        ChannelPagedQueryResponse value = ChannelPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ChannelPagedQueryResponse value = ChannelPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ChannelPagedQueryResponse value = ChannelPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ChannelPagedQueryResponse value = ChannelPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ChannelPagedQueryResponse value = ChannelPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.channel.ChannelImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelImpl()));
    }
}
