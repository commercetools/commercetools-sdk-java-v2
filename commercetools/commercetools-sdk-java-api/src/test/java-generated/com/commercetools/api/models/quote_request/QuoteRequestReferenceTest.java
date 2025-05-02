
package com.commercetools.api.models.quote_request;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestReferenceBuilder builder) {
        QuoteRequestReference quoteRequestReference = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestReference).isInstanceOf(QuoteRequestReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "obj", QuoteRequestReference.builder()
                .obj(new com.commercetools.api.models.quote_request.QuoteRequestImpl()) } };
    }

    @Test
    public void obj() {
        QuoteRequestReference value = QuoteRequestReference.of();
        value.setObj(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
    }
}
