package com.commercetools.api.defaultconfig;

import io.vrap.rmf.base.client.http.CorrelationIdProvider;

import java.util.UUID;

public class ApiCorrelationIdProvider implements CorrelationIdProvider {
    private final String projectKey;

    public ApiCorrelationIdProvider(String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    public String getCorrelationId() {
        return projectKey + "/" + UUID.randomUUID();
    }
}
