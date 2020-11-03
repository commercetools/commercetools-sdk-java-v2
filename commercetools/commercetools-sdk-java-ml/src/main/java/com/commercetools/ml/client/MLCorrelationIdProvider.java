package com.commercetools.ml.client;

import io.vrap.rmf.base.client.http.CorrelationIdProvider;

import java.util.UUID;

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

