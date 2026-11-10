
package com.commercetools.api.models.quote_request;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestUpdateBuilder builder) {
        QuoteRequestUpdate quoteRequestUpdate = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestUpdate).isInstanceOf(QuoteRequestUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", QuoteRequestUpdate.builder().version(2L) },
                new Object[] { "actions",
                        QuoteRequestUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.quote_request.QuoteRequestUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        QuoteRequestUpdate value = QuoteRequestUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        QuoteRequestUpdate value = QuoteRequestUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.quote_request.QuoteRequestUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.quote_request.QuoteRequestUpdateActionImpl()));
    }
}
