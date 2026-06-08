
package com.commercetools.history.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Execute a GraphQL request.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.history.models.graph_ql.GraphQLResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .graphql()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyGraphqlPostString extends
        StringBodyApiMethod<ByProjectKeyGraphqlPostString, com.commercetools.history.models.graph_ql.GraphQLResponse> {

    @Override
    public TypeReference<com.commercetools.history.models.graph_ql.GraphQLResponse> resultType() {
        return new TypeReference<com.commercetools.history.models.graph_ql.GraphQLResponse>() {
        };
    }

    private String projectKey;

    private String graphQLRequest;

    public ByProjectKeyGraphqlPostString(final ApiHttpClient apiHttpClient, String projectKey, String graphQLRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.graphQLRequest = graphQLRequest;
    }

    public ByProjectKeyGraphqlPostString(ByProjectKeyGraphqlPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.graphQLRequest = t.graphQLRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/graphql", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            graphQLRequest.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.history.models.graph_ql.GraphQLResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.history.models.graph_ql.GraphQLResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.history.models.graph_ql.GraphQLResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.history.models.graph_ql.GraphQLResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return graphQLRequest;
    }

    public ByProjectKeyGraphqlPostString withBody(String graphQLRequest) {
        ByProjectKeyGraphqlPostString t = copy();
        t.graphQLRequest = graphQLRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyGraphqlPostString that = (ByProjectKeyGraphqlPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(graphQLRequest, that.graphQLRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(graphQLRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyGraphqlPostString copy() {
        return new ByProjectKeyGraphqlPostString(this);
    }
}
