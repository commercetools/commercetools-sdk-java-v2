
package com.commercetools.api.models.quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteReferenceBuilder builder) {
        QuoteReference quoteReference = builder.buildUnchecked();
        Assertions.assertThat(quoteReference).isInstanceOf(QuoteReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "obj",
                QuoteReference.builder().obj(new com.commercetools.api.models.quote.QuoteImpl()) } };
    }

    @Test
    public void obj() {
        QuoteReference value = QuoteReference.of();
        value.setObj(new com.commercetools.api.models.quote.QuoteImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.quote.QuoteImpl());
    }
}
