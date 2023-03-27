
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * VersionedTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface VersionedTrait<T extends VersionedTrait<T>> {
    List<String> getVersion();

    /**
     * set version with the specificied value
     * @param version value to be set
     * @param <TValue> value type
     * @return VersionedTrait
     */
    <TValue> VersionedTrait<T> withVersion(final TValue version);

    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return VersionedTrait
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
