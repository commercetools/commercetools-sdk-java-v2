
package com.commercetools.api.client;

import java.io.Closeable;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ApiRoot implements Closeable {

    private final ApiHttpClient apiHttpClient;

    private ApiRoot(final ApiHttpClient apiHttpClient) {
        this.apiHttpClient = apiHttpClient;
    }

    public static ApiRoot fromClient(final ApiHttpClient apiHttpClient) {
        return new ApiRoot(apiHttpClient);
    }

    public ByProjectKeyRequestBuilder withProjectKey(String projectKey) {
        return new ByProjectKeyRequestBuilder(this.apiHttpClient, projectKey);
    }

    @Override
    public void close() {
        try {
            apiHttpClient.close();
        }
        catch (final Throwable ignored) {
        }
    }
}
