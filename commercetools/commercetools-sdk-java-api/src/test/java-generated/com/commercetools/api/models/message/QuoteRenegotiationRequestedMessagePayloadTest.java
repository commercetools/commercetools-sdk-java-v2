
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRenegotiationRequestedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRenegotiationRequestedMessagePayloadBuilder builder) {
        QuoteRenegotiationRequestedMessagePayload quoteRenegotiationRequestedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteRenegotiationRequestedMessagePayload)
                .isInstanceOf(QuoteRenegotiationRequestedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "buyerComment",
                QuoteRenegotiationRequestedMessagePayload.builder().buyerComment("buyerComment") } };
    }

    @Test
    public void buyerComment() {
        QuoteRenegotiationRequestedMessagePayload value = QuoteRenegotiationRequestedMessagePayload.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }
}
