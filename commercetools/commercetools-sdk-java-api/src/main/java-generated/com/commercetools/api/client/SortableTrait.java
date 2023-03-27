
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SortableTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SortableTrait<T extends SortableTrait<T>> {
    List<String> getSort();

    /**
     * set sort with the specificied value
     * @param sort value to be set
     * @param <TValue> value type
     * @return SortableTrait
     */
    <TValue> SortableTrait<T> withSort(final TValue sort);

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return SortableTrait
     */
    <TValue> SortableTrait<T> addSort(final TValue sort);

    default SortableTrait<T> asSortableTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asSortableTraitToBaseType() {
        return (T) this;
    }

}
