package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.http.CorrelationIdProvider;

import java.util.UUID;

public class ImportCorrelationIdProvider implements CorrelationIdProvider {
    private final String projectKey;

    public ImportCorrelationIdProvider(String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    public String getCorrelationId() {
        return projectKey + "/" + UUID.randomUUID();
    }
}
