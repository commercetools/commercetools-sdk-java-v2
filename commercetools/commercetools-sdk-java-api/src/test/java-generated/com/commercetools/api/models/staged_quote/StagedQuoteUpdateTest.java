
package com.commercetools.api.models.staged_quote;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteUpdateBuilder builder) {
        StagedQuoteUpdate stagedQuoteUpdate = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteUpdate).isInstanceOf(StagedQuoteUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", StagedQuoteUpdate.builder().version(2L) },
                new Object[] { "actions",
                        StagedQuoteUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        StagedQuoteUpdate value = StagedQuoteUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        StagedQuoteUpdate value = StagedQuoteUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionImpl()));
    }
}
