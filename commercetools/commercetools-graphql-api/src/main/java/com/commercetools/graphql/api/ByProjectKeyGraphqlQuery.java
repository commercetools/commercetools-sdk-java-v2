
package com.commercetools.graphql.api;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ErrorableTrait;
import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Execute a GraphQL query</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<GraphQLDataResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .graphql()
 *            .query(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
public class ByProjectKeyGraphqlQuery<T>
        extends BodyApiMethod<ByProjectKeyGraphqlQuery<T>, GraphQLResponse<T>, GraphQLRequest<T>>
        implements ErrorableTrait<ByProjectKeyGraphqlQuery<T>> {

    @Override
    public TypeReference<GraphQLResponse<T>> resultType() {
        return new TypeReference<GraphQLResponse<T>>() {
        };
    }

    private String projectKey;

    private GraphQLRequest<T> graphQLRequest;

    public ByProjectKeyGraphqlQuery(final ApiHttpClient apiHttpClient, String projectKey,
            GraphQLRequest<T> graphQLRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.graphQLRequest = graphQLRequest;
    }

    public ByProjectKeyGraphqlQuery(ByProjectKeyGraphqlQuery<T> t) {
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
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(graphQLRequest)));
    }

    @Override
    public ApiHttpResponse<GraphQLResponse<T>> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, GraphQLDataResponse.class)
                .withBody(graphQLDataResponse -> GraphQLResponse.of(graphQLDataResponse, graphQLRequest));
    }

    @Override
    public CompletableFuture<ApiHttpResponse<GraphQLResponse<T>>> execute(final ApiHttpClient client) {
        return execute(client, GraphQLDataResponse.class).thenApply(response -> response
                .withBody(graphQLDataResponse -> GraphQLResponse.of(response.getBody(), graphQLRequest)));
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public GraphQLRequest<T> getBody() {
        return graphQLRequest;
    }

    public ByProjectKeyGraphqlQuery<T> withBody(GraphQLRequest<T> graphQLRequest) {
        ByProjectKeyGraphqlQuery<T> t = copy();
        t.graphQLRequest = graphQLRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyGraphqlQuery<?> that = (ByProjectKeyGraphqlQuery<?>) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(graphQLRequest, that.graphQLRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(graphQLRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyGraphqlQuery<T> copy() {
        return new ByProjectKeyGraphqlQuery<>(this);
    }
}
