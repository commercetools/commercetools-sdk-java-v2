
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface VersionedTrait<T extends VersionedTrait<T>> {
    List<String> getVersion();

    /**
     * set version with the specificied value
     */
    <TValue> VersionedTrait<T> withVersion(final TValue version);

    /**
     * add additional version query parameter
     */
    <TValue> VersionedTrait<T> addVersion(final TValue version);

    default VersionedTrait<T> asVersionedTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asVersionedTraitToBaseType() {
        return (T) this;
    }
}
