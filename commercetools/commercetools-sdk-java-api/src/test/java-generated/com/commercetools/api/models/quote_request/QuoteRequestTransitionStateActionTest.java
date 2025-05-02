
package com.commercetools.api.models.quote_request;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestTransitionStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestTransitionStateActionBuilder builder) {
        QuoteRequestTransitionStateAction quoteRequestTransitionStateAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestTransitionStateAction).isInstanceOf(QuoteRequestTransitionStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        QuoteRequestTransitionStateAction.builder()
                                .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "force", QuoteRequestTransitionStateAction.builder().force(true) } };
    }

    @Test
    public void state() {
        QuoteRequestTransitionStateAction value = QuoteRequestTransitionStateAction.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void force() {
        QuoteRequestTransitionStateAction value = QuoteRequestTransitionStateAction.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
