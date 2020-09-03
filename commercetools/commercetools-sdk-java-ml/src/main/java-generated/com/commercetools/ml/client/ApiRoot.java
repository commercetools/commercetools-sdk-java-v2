package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.middlewares.Middleware;

import java.util.List;
import java.util.Arrays;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ApiRoot {

    private final ApiHttpClient apiHttpClient;

    private ApiRoot(final Middleware... middlewares) {
       this.apiHttpClient = new ApiHttpClient(Arrays.asList(middlewares));
    }

    public static ApiRoot fromMiddlewares(final Middleware... middlewares) {
        return new ApiRoot(middlewares);
    }

    private ApiRoot(final ApiHttpClient client) {
        this.apiHttpClient = client;
    }

    public static ApiRoot fromClient(final ApiHttpClient client) {
        return new ApiRoot(client);
    }

    public ByProjectKeyRequestBuilder withProjectKey(String projectKey) {
        return new ByProjectKeyRequestBuilder(this.apiHttpClient, projectKey);
    }

}
