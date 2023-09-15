
package com.commercetools.api.models.subscription;

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
public class SubscriptionPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SubscriptionPagedQueryResponseBuilder builder) {
        SubscriptionPagedQueryResponse subscriptionPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(subscriptionPagedQueryResponse).isInstanceOf(SubscriptionPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SubscriptionPagedQueryResponse.builder().limit(7L) },
                new Object[] { SubscriptionPagedQueryResponse.builder().offset(3L) },
                new Object[] { SubscriptionPagedQueryResponse.builder().count(2L) },
                new Object[] { SubscriptionPagedQueryResponse.builder().total(1L) },
                new Object[] { SubscriptionPagedQueryResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.subscription.SubscriptionImpl())) } };
    }

    @Test
    public void limit() {
        SubscriptionPagedQueryResponse value = SubscriptionPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        SubscriptionPagedQueryResponse value = SubscriptionPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        SubscriptionPagedQueryResponse value = SubscriptionPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        SubscriptionPagedQueryResponse value = SubscriptionPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        SubscriptionPagedQueryResponse value = SubscriptionPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.subscription.SubscriptionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.subscription.SubscriptionImpl()));
    }
}
