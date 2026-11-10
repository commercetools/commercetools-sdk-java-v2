
package com.commercetools.api.models.quote;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteUpdateBuilder builder) {
        QuoteUpdate quoteUpdate = builder.buildUnchecked();
        Assertions.assertThat(quoteUpdate).isInstanceOf(QuoteUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", QuoteUpdate.builder().version(2L) }, new Object[] { "actions",
                QuoteUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.quote.QuoteUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        QuoteUpdate value = QuoteUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        QuoteUpdate value = QuoteUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.quote.QuoteUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.quote.QuoteUpdateActionImpl()));
    }
}
