
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentResponsesQuoteRequestSuccessTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentResponsesQuoteRequestSuccessBuilder builder) {
        AgentResponsesQuoteRequestSuccess agentResponsesQuoteRequestSuccess = builder.buildUnchecked();
        Assertions.assertThat(agentResponsesQuoteRequestSuccess).isInstanceOf(AgentResponsesQuoteRequestSuccess.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "entity",
                        AgentResponsesQuoteRequestSuccess.builder()
                                .entity(new com.commercetools.api.models.quote_request.QuoteRequestImpl()) },
                new Object[] { "cartId", AgentResponsesQuoteRequestSuccess.builder().cartId("cartId") } };
    }

    @Test
    public void entity() {
        AgentResponsesQuoteRequestSuccess value = AgentResponsesQuoteRequestSuccess.of();
        value.setEntity(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
        Assertions.assertThat(value.getEntity())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
    }

    @Test
    public void cartId() {
        AgentResponsesQuoteRequestSuccess value = AgentResponsesQuoteRequestSuccess.of();
        value.setCartId("cartId");
        Assertions.assertThat(value.getCartId()).isEqualTo("cartId");
    }
}
