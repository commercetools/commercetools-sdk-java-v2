
package com.commercetools.history.client;

import java.io.Closeable;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.SerializerOnlyApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * Entrypoint for building requests against the API
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApiRoot implements Closeable {

    private final ApiHttpClient apiHttpClient;

    private ApiRoot(final ApiHttpClient apiHttpClient) {
        this.apiHttpClient = apiHttpClient;
    }

    public static ApiRoot of() {
        return new ApiRoot(SerializerOnlyApiHttpClient.of());
    }

    public static ApiRoot fromClient(final ApiHttpClient apiHttpClient) {
        return new ApiRoot(apiHttpClient);
    }

    public ByProjectKeyRequestBuilder withProjectKeyValue(String projectKey) {
        return new ByProjectKeyRequestBuilder(this.apiHttpClient, projectKey);
    }

    @Override
    public void close() {
        if (apiHttpClient == null) {
            return;
        }
        try {
            apiHttpClient.close();
        }
        catch (final Throwable ignored) {
        }
    }

}
