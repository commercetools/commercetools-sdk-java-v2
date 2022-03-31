
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Execute a GraphQL query</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyGraphqlPost extends
        BodyApiMethod<ByProjectKeyGraphqlPost, com.commercetools.api.models.graph_ql.GraphQLResponse, com.commercetools.api.models.graph_ql.GraphQLRequest>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyGraphqlPost> {

    private String projectKey;

    private com.commercetools.api.models.graph_ql.GraphQLRequest graphQLRequest;

    public ByProjectKeyGraphqlPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.graph_ql.GraphQLRequest graphQLRequest) {
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
        String httpRequestPath = String.format("/%s/graphql", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(graphQLRequest)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.graph_ql.GraphQLResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.graph_ql.GraphQLResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.graph_ql.GraphQLResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.graph_ql.GraphQLResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.graph_ql.GraphQLRequest getBody() {
        return graphQLRequest;
    }

    public ByProjectKeyGraphqlPost withBody(com.commercetools.api.models.graph_ql.GraphQLRequest graphQLRequest) {
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
