
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentResponsesRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentResponsesRequestBuilder builder) {
        AgentResponsesRequest agentResponsesRequest = builder.buildUnchecked();
        Assertions.assertThat(agentResponsesRequest).isInstanceOf(AgentResponsesRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "outputType", AgentResponsesRequest.builder()
                        .outputType(com.commercetools.api.models.agent.AgentResponsesOutputType.findEnum("Cart")) },
                new Object[] { "locale", AgentResponsesRequest.builder().locale("locale") },
                new Object[] { "prompt", AgentResponsesRequest.builder().prompt("prompt") },
                new Object[] { "businessUnit", AgentResponsesRequest.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "store", AgentResponsesRequest.builder()
                        .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) } };
    }

    @Test
    public void outputType() {
        AgentResponsesRequest value = AgentResponsesRequest.of();
        value.setOutputType(com.commercetools.api.models.agent.AgentResponsesOutputType.findEnum("Cart"));
        Assertions.assertThat(value.getOutputType())
                .isEqualTo(com.commercetools.api.models.agent.AgentResponsesOutputType.findEnum("Cart"));
    }

    @Test
    public void locale() {
        AgentResponsesRequest value = AgentResponsesRequest.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void prompt() {
        AgentResponsesRequest value = AgentResponsesRequest.of();
        value.setPrompt("prompt");
        Assertions.assertThat(value.getPrompt()).isEqualTo("prompt");
    }

    @Test
    public void businessUnit() {
        AgentResponsesRequest value = AgentResponsesRequest.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void store() {
        AgentResponsesRequest value = AgentResponsesRequest.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
