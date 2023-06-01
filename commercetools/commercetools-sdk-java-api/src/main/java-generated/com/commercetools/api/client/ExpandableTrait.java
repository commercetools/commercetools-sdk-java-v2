package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;
import java.util.List;

/**
 * ExpandableTrait
 * @param <T> type of extending interface
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ExpandableTrait<T extends ExpandableTrait<T>>  {
    List<String> getExpand();

    /**
     * set expand with the specificied value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ExpandableTrait
     */
    <TValue> ExpandableTrait<T> withExpand(final TValue expand);
    
    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ExpandableTrait
     */
    <TValue> ExpandableTrait<T> addExpand(final TValue expand);

    
    default ExpandableTrait<T> asExpandableTrait() {
        return this;
    }
    
    @SuppressWarnings("unchecked")
    default T asExpandableTraitToBaseType() {
        return (T)this;
    }
    
}
