
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentResponsesPayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentResponsesPayloadBuilder builder) {
        AgentResponsesPayload agentResponsesPayload = builder.buildUnchecked();
        Assertions.assertThat(agentResponsesPayload).isInstanceOf(AgentResponsesPayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "outputType", AgentResponsesPayload.builder()
                        .outputType(com.commercetools.api.models.agent.AgentResponsesOutputType.findEnum("Cart")) },
                new Object[] { "locale", AgentResponsesPayload.builder().locale("locale") },
                new Object[] { "prompt", AgentResponsesPayload.builder().prompt("prompt") },
                new Object[] { "businessUnit", AgentResponsesPayload.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "store", AgentResponsesPayload.builder()
                        .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) } };
    }

    @Test
    public void outputType() {
        AgentResponsesPayload value = AgentResponsesPayload.of();
        value.setOutputType(com.commercetools.api.models.agent.AgentResponsesOutputType.findEnum("Cart"));
        Assertions.assertThat(value.getOutputType())
                .isEqualTo(com.commercetools.api.models.agent.AgentResponsesOutputType.findEnum("Cart"));
    }

    @Test
    public void locale() {
        AgentResponsesPayload value = AgentResponsesPayload.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void prompt() {
        AgentResponsesPayload value = AgentResponsesPayload.of();
        value.setPrompt("prompt");
        Assertions.assertThat(value.getPrompt()).isEqualTo("prompt");
    }

    @Test
    public void businessUnit() {
        AgentResponsesPayload value = AgentResponsesPayload.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void store() {
        AgentResponsesPayload value = AgentResponsesPayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
