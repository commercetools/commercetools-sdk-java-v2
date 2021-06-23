
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Execute a GraphQL query</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyGraphqlPost
        extends ApiMethod<ByProjectKeyGraphqlPost, com.commercetools.api.models.graph_ql.GraphQLResponse>
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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/graphql", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(graphQLRequest);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.graph_ql.GraphQLResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.graph_ql.GraphQLResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.graph_ql.GraphQLResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.graph_ql.GraphQLResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyGraphqlPost copy() {
        return new ByProjectKeyGraphqlPost(this);
    }
}
