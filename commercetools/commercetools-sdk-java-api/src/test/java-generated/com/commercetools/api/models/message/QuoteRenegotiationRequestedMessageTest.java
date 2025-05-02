
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRenegotiationRequestedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRenegotiationRequestedMessageBuilder builder) {
        QuoteRenegotiationRequestedMessage quoteRenegotiationRequestedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteRenegotiationRequestedMessage)
                .isInstanceOf(QuoteRenegotiationRequestedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "buyerComment",
                QuoteRenegotiationRequestedMessage.builder().buyerComment("buyerComment") } };
    }

    @Test
    public void buyerComment() {
        QuoteRenegotiationRequestedMessage value = QuoteRenegotiationRequestedMessage.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }
}
