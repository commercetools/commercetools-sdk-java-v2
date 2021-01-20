
package com.commercetools.ml.client;

import java.util.UUID;

import io.vrap.rmf.base.client.http.CorrelationIdProvider;

public class MLCorrelationIdProvider implements CorrelationIdProvider {
    private final String projectKey;

    public MLCorrelationIdProvider(String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    public String getCorrelationId() {
        return projectKey + "/" + UUID.randomUUID();
    }
}
