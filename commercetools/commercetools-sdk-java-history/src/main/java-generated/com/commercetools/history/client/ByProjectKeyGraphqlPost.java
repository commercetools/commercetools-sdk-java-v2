
package com.commercetools.history.client;

import java.net.URI;
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
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyGraphqlPost extends
        TypeBodyApiMethod<ByProjectKeyGraphqlPost, com.commercetools.history.models.graph_ql.GraphQLResponse, com.commercetools.history.models.graph_ql.GraphQLRequest> {

    @Override
    public TypeReference<com.commercetools.history.models.graph_ql.GraphQLResponse> resultType() {
        return new TypeReference<com.commercetools.history.models.graph_ql.GraphQLResponse>() {
        };
    }

    private String projectKey;

    private com.commercetools.history.models.graph_ql.GraphQLRequest graphQLRequest;

    public ByProjectKeyGraphqlPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.history.models.graph_ql.GraphQLRequest graphQLRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.graphQLRequest = graphQLRequest;
    }

    public ByProjectKeyGraphqlPost(ByProjectKeyGraphqlPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.graphQLRequest = t.graphQLRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/graphql", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(graphQLRequest)));

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

    public com.commercetools.history.models.graph_ql.GraphQLRequest getBody() {
        return graphQLRequest;
    }

    public ByProjectKeyGraphqlPost withBody(com.commercetools.history.models.graph_ql.GraphQLRequest graphQLRequest) {
        ByProjectKeyGraphqlPost t = copy();
        t.graphQLRequest = graphQLRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyGraphqlPost that = (ByProjectKeyGraphqlPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(graphQLRequest, that.graphQLRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(graphQLRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyGraphqlPost copy() {
        return new ByProjectKeyGraphqlPost(this);
    }
}
