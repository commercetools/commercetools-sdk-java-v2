
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAgentsIntakeV1ResponsesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyAgentsIntakeV1ResponsesRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyAgentsIntakeV1ResponsesPost post(
            com.commercetools.api.models.agent.AgentResponsesRequest agentResponsesRequest) {
        return new ByProjectKeyAgentsIntakeV1ResponsesPost(apiHttpClient, projectKey, agentResponsesRequest);
    }

    public ByProjectKeyAgentsIntakeV1ResponsesPostString post(final String agentResponsesRequest) {
        return new ByProjectKeyAgentsIntakeV1ResponsesPostString(apiHttpClient, projectKey, agentResponsesRequest);
    }

    public ByProjectKeyAgentsIntakeV1ResponsesPost post(
            UnaryOperator<com.commercetools.api.models.agent.AgentResponsesRequestBuilder> op) {
        return post(op.apply(com.commercetools.api.models.agent.AgentResponsesRequestBuilder.of()).build());
    }

}
