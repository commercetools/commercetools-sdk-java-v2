package com.commercetools.sdk.examples.springmvc.service;

public enum OtelProvider {
    LOCAL(true),
    NEW_RELIC(true),
    DYNATRACE(false);

    private final boolean supportsHistogram;

    OtelProvider(boolean supportsHistogram) {
        this.supportsHistogram = supportsHistogram;
    }

    public boolean supportsHistogram() {
        return supportsHistogram;
    }
}
