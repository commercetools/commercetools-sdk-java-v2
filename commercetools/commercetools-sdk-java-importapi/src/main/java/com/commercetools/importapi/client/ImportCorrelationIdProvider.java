
package com.commercetools.importapi.client;

import java.util.UUID;

import io.vrap.rmf.base.client.http.CorrelationIdProvider;

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
