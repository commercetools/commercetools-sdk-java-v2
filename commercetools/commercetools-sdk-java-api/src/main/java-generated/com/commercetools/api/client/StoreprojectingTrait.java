package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;
import java.util.List;

/**
 * StoreprojectingTrait
 * @param <T> type of extending interface
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface StoreprojectingTrait<T extends StoreprojectingTrait<T>>  {
    List<String> getStoreProjection();

    /**
     * set storeProjection with the specificied value
     * @param storeProjection value to be set
     * @param <TValue> value type
     * @return StoreprojectingTrait
     */
    <TValue> StoreprojectingTrait<T> withStoreProjection(final TValue storeProjection);
    
    /**
     * add additional storeProjection query parameter
     * @param storeProjection value to be added
     * @param <TValue> value type
     * @return StoreprojectingTrait
     */
    <TValue> StoreprojectingTrait<T> addStoreProjection(final TValue storeProjection);

    
    default StoreprojectingTrait<T> asStoreprojectingTrait() {
        return this;
    }
    
    @SuppressWarnings("unchecked")
    default T asStoreprojectingTraitToBaseType() {
        return (T)this;
    }
    
}
