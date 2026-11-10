
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyOrderFromQuoteDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyOrderFromQuoteDraftBuilder builder) {
        MyOrderFromQuoteDraft myOrderFromQuoteDraft = builder.buildUnchecked();
        Assertions.assertThat(myOrderFromQuoteDraft).isInstanceOf(MyOrderFromQuoteDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", MyOrderFromQuoteDraft.builder().id("id") },
                new Object[] { "version", MyOrderFromQuoteDraft.builder().version(2L) },
                new Object[] { "quoteStateToAccepted", MyOrderFromQuoteDraft.builder().quoteStateToAccepted(true) } };
    }

    @Test
    public void id() {
        MyOrderFromQuoteDraft value = MyOrderFromQuoteDraft.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        MyOrderFromQuoteDraft value = MyOrderFromQuoteDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void quoteStateToAccepted() {
        MyOrderFromQuoteDraft value = MyOrderFromQuoteDraft.of();
        value.setQuoteStateToAccepted(true);
        Assertions.assertThat(value.getQuoteStateToAccepted()).isEqualTo(true);
    }
}
