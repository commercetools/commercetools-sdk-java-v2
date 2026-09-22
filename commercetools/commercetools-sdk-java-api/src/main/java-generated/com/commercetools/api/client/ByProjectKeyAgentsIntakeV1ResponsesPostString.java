
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Turns a natural-language prompt, optionally with supporting files, into a created <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a>, returned in commercetools REST representation.</p>
 *  <p>Non-fatal issues, such as requested Products that could not be matched to the catalog or a file that failed to parse, are reported as <code>warnings</code> alongside a successful <code>201</code> response rather than failing the request.</p>
 *  <p>Accepts either an <code>application/json</code> body or a <code>multipart/form-data</code> request. An <code>application/json</code> body requires <code>prompt</code>. A <code>multipart/form-data</code> request requires <code>prompt</code>, an uploaded file, or both. See <span>Multipart form data</span> for the file upload format.</p>
 *  <p>If the Intake Agent is not enabled for the Project, a <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentFeatureDisabledError" rel="nofollow">FeatureDisabled</a> error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.agent.AgentResponsesSuccess>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .agents()
 *            .intake()
 *            .v1()
 *            .responses()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAgentsIntakeV1ResponsesPostString extends
        StringBodyApiMethod<ByProjectKeyAgentsIntakeV1ResponsesPostString, com.commercetools.api.models.agent.AgentResponsesSuccess> {

    @Override
    public TypeReference<com.commercetools.api.models.agent.AgentResponsesSuccess> resultType() {
        return new TypeReference<com.commercetools.api.models.agent.AgentResponsesSuccess>() {
        };
    }

    private String projectKey;

    private String agentResponsesRequest;

    public ByProjectKeyAgentsIntakeV1ResponsesPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String agentResponsesRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.agentResponsesRequest = agentResponsesRequest;
    }

    public ByProjectKeyAgentsIntakeV1ResponsesPostString(ByProjectKeyAgentsIntakeV1ResponsesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.agentResponsesRequest = t.agentResponsesRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/agents/intake/v1/responses", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            agentResponsesRequest.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.agent.AgentResponsesSuccess> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.agent.AgentResponsesSuccess.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.agent.AgentResponsesSuccess>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.agent.AgentResponsesSuccess.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return agentResponsesRequest;
    }

    public ByProjectKeyAgentsIntakeV1ResponsesPostString withBody(String agentResponsesRequest) {
        ByProjectKeyAgentsIntakeV1ResponsesPostString t = copy();
        t.agentResponsesRequest = agentResponsesRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAgentsIntakeV1ResponsesPostString that = (ByProjectKeyAgentsIntakeV1ResponsesPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(agentResponsesRequest, that.agentResponsesRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(agentResponsesRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyAgentsIntakeV1ResponsesPostString copy() {
        return new ByProjectKeyAgentsIntakeV1ResponsesPostString(this);
    }
}
