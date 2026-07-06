
package com.commercetools.checkout.client;

import java.util.UUID;

import io.vrap.rmf.base.client.http.CorrelationIdProvider;

public class CheckoutCorrelationIdProvider implements CorrelationIdProvider {
    private final String projectKey;

    public CheckoutCorrelationIdProvider(String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    public String getCorrelationId() {
        return projectKey + "/" + UUID.randomUUID();
    }
}
