
package com.commercetools.api.client;

import java.util.UUID;

import io.vrap.rmf.base.client.http.CorrelationIdProvider;

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
