package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;
import java.util.List;

/**
 * DataerasureTrait
 * @param <T> type of extending interface
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface DataerasureTrait<T extends DataerasureTrait<T>>  {
    List<String> getDataErasure();

    /**
     * set dataErasure with the specificied value
     * @param dataErasure value to be set
     * @param <TValue> value type
     * @return DataerasureTrait
     */
    <TValue> DataerasureTrait<T> withDataErasure(final TValue dataErasure);
    
    /**
     * add additional dataErasure query parameter
     * @param dataErasure value to be added
     * @param <TValue> value type
     * @return DataerasureTrait
     */
    <TValue> DataerasureTrait<T> addDataErasure(final TValue dataErasure);

    
    default DataerasureTrait<T> asDataerasureTrait() {
        return this;
    }
    
    @SuppressWarnings("unchecked")
    default T asDataerasureTraitToBaseType() {
        return (T)this;
    }
    
}
