
package com.commercetools.api.models.subscription;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionPagedQueryResponseBuilder builder) {
        SubscriptionPagedQueryResponse subscriptionPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(subscriptionPagedQueryResponse).isInstanceOf(SubscriptionPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", SubscriptionPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", SubscriptionPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", SubscriptionPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", SubscriptionPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        SubscriptionPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.subscription.SubscriptionImpl())) } };
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
