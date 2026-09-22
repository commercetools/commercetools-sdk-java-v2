
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentResponsesSuccessBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesSuccessBuilder {

    public com.commercetools.api.models.agent.AgentResponsesCartSuccessBuilder cartBuilder() {
        return com.commercetools.api.models.agent.AgentResponsesCartSuccessBuilder.of();
    }

    public com.commercetools.api.models.agent.AgentResponsesQuoteRequestSuccessBuilder quoteRequestBuilder() {
        return com.commercetools.api.models.agent.AgentResponsesQuoteRequestSuccessBuilder.of();
    }

    /**
     * factory method for an instance of AgentResponsesSuccessBuilder
     * @return builder
     */
    public static AgentResponsesSuccessBuilder of() {
        return new AgentResponsesSuccessBuilder();
    }

}
