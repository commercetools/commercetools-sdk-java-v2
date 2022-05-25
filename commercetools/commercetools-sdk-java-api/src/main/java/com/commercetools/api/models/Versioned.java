
package com.commercetools.api.models;

public interface Versioned<T> extends Identifiable<T> {
    @Override
    String getId();

    Long getVersion();

    /**
     * Creates a versioned that only contains the id and the version.
     * @param versioned the template object to use its ID and version
     * @param <T> The type which has an ID and version.
     * @return versioned
     */
    static <T> Versioned<T> of(final Versioned<T> versioned) {
        return of(versioned.getId(), versioned.getVersion());
    }

    static <T> Versioned<T> of(final String id, final long version) {
        return new SimpleVersioned<>(id, version);
    }
}
