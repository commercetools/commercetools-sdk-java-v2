
package com.commercetools.history.client;

import java.util.UUID;

import io.vrap.rmf.base.client.http.CorrelationIdProvider;

public class HistoryCorrelationIdProvider implements CorrelationIdProvider {
    private final String projectKey;

    public HistoryCorrelationIdProvider(String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    public String getCorrelationId() {
        return projectKey + "/" + UUID.randomUUID();
    }
}
