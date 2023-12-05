package com.commercetools.sdk.examples.springmvc.service;

public enum OtelProvider {
    LOCAL(true, true),
    NEW_RELIC(true, true),
    DYNATRACE(false, false);

    private final boolean supportsHistogram;

    private final boolean useOtelSerializer;

    OtelProvider(boolean supportsHistogram, boolean useOtelSerializer) {
        this.supportsHistogram = supportsHistogram;
        this.useOtelSerializer = useOtelSerializer;
    }

    public boolean supportsHistogram() {
        return supportsHistogram;
    }

    public boolean useOtelSerializer() {
        return useOtelSerializer;
    }
}
