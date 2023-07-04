
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyGraphqlRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyGraphqlRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyGraphqlPost post(com.commercetools.api.models.graph_ql.GraphQLRequest graphQLRequest) {
        return new ByProjectKeyGraphqlPost(apiHttpClient, projectKey, graphQLRequest);
    }

    public ByProjectKeyGraphqlPostString post(final String graphQLRequest) {
        return new ByProjectKeyGraphqlPostString(apiHttpClient, projectKey, graphQLRequest);
    }

    public ByProjectKeyGraphqlPost post(UnaryOperator<com.commercetools.api.models.graph_ql.GraphQLRequestBuilder> op) {
        return post(op.apply(com.commercetools.api.models.graph_ql.GraphQLRequestBuilder.of()).build());
    }

    public <TMethod> TMethod query(ProjectRequestBuilder<TMethod> requestBuilder) {
        return requestBuilder.build(apiHttpClient, projectKey);
    }

}
