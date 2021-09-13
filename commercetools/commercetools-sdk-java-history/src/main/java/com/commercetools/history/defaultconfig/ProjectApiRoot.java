
package com.commercetools.history.defaultconfig;

import java.io.Closeable;

import com.commercetools.history.client.ApiRoot;
import com.commercetools.history.client.ByProjectKeyByResourceTypeRequestBuilder;
import com.commercetools.history.client.ByProjectKeyRequestBuilder;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.SerializerOnlyApiHttpClient;

public class ProjectApiRoot implements Closeable {
    private final String projectKey;
    private final ApiHttpClient apiHttpClient;

    private ProjectApiRoot(final String projectKey, final ApiHttpClient apiHttpClient) {
        this.projectKey = projectKey;
        this.apiHttpClient = apiHttpClient;
    }

    public static ProjectApiRoot of(final String projectKey) {
        return new ProjectApiRoot(projectKey, SerializerOnlyApiHttpClient.of());
    }

    public static ProjectApiRoot fromClient(final String projectKey, final ApiHttpClient apiHttpClient) {
        return new ProjectApiRoot(projectKey, apiHttpClient);
    }

    public ByProjectKeyRequestBuilder with() {
        return ApiRoot.fromClient(apiHttpClient).withProjectKeyValue(projectKey);
    }

    public ByProjectKeyRequestBuilder withProjectKey(final String projectKey) {
        return ApiRoot.fromClient(apiHttpClient).withProjectKeyValue(projectKey);
    }

    public ByProjectKeyByResourceTypeRequestBuilder withResourceTypeValue(String resourceType) {
        return with().withResourceTypeValue(resourceType);
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
