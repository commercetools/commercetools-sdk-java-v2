
package com.commercetools.api.models;

class SimpleVersioned<T> implements Versioned<T> {
    private final String id;
    private final Long version;

    SimpleVersioned(final String id, final Long version) {
        this.id = id;
        this.version = version;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Long getVersion() {
        return version;
    }
}
