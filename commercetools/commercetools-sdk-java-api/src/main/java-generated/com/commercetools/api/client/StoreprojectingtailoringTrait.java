
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreprojectingtailoringTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StoreprojectingtailoringTrait<T extends StoreprojectingtailoringTrait<T>> {
    List<String> getStoreProjection();

    /**
     * set storeProjection with the specificied value
     * @param storeProjection value to be set
     * @param <TValue> value type
     * @return StoreprojectingtailoringTrait
     */
    <TValue> StoreprojectingtailoringTrait<T> withStoreProjection(final TValue storeProjection);

    /**
     * add additional storeProjection query parameter
     * @param storeProjection value to be added
     * @param <TValue> value type
     * @return StoreprojectingtailoringTrait
     */
    <TValue> StoreprojectingtailoringTrait<T> addStoreProjection(final TValue storeProjection);

    default StoreprojectingtailoringTrait<T> asStoreprojectingtailoringTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asStoreprojectingtailoringTraitToBaseType() {
        return (T) this;
    }

}
