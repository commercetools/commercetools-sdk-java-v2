
package com.commercetools.ml.client;

import java.io.Closeable;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.SerializerOnlyApiHttpClient;

public class ProjectApiRoot implements Closeable, ProjectScopedApiRoot {
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

    @Override
    public ByProjectKeyRequestBuilder with() {
        return ApiRoot.fromClient(apiHttpClient).withProjectKey(projectKey);
    }

    public ByProjectKeyRequestBuilder withProjectKey(final String projectKey) {
        return ApiRoot.fromClient(apiHttpClient).withProjectKey(projectKey);
    }

    @Override
    public ByProjectKeyImageSearchRequestBuilder imageSearch() {
        return with().imageSearch();
    }

    @Override
    public ByProjectKeyRecommendationsRequestBuilder recommendations() {
        return with().recommendations();
    }

    @Override
    public ByProjectKeySimilaritiesRequestBuilder similarities() {
        return with().similarities();
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
