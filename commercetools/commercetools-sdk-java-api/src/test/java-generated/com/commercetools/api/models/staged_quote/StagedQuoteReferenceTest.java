
package com.commercetools.api.models.staged_quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteReferenceBuilder builder) {
        StagedQuoteReference stagedQuoteReference = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteReference).isInstanceOf(StagedQuoteReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "obj",
                StagedQuoteReference.builder().obj(new com.commercetools.api.models.staged_quote.StagedQuoteImpl()) } };
    }

    @Test
    public void obj() {
        StagedQuoteReference value = StagedQuoteReference.of();
        value.setObj(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
    }
}
