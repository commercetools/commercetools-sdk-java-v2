
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreprojectingTrait
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StoreprojectingTrait<T extends StoreprojectingTrait<T>> {
    List<String> getStoreProjection();

    /**
     * set storeProjection with the specificied value
     */
    <TValue> StoreprojectingTrait<T> withStoreProjection(final TValue storeProjection);

    /**
     * add additional storeProjection query parameter
     */
    <TValue> StoreprojectingTrait<T> addStoreProjection(final TValue storeProjection);

    default StoreprojectingTrait<T> asStoreprojectingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asStoreprojectingTraitToBaseType() {
        return (T) this;
    }
}
