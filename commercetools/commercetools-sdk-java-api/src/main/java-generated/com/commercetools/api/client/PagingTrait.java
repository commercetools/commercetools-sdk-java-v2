package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;
import java.util.List;

/**
 * PagingTrait
 * @param <T> type of extending interface
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface PagingTrait<T extends PagingTrait<T>>  {
    List<String> getLimit();
    
    List<String> getOffset();
    
    List<String> getWithTotal();

    /**
     * set limit with the specificied value
     * @param limit value to be set
     * @param <TValue> value type
     * @return PagingTrait
     */
    <TValue> PagingTrait<T> withLimit(final TValue limit);
    
    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return PagingTrait
     */
    <TValue> PagingTrait<T> addLimit(final TValue limit);
    
    /**
     * set offset with the specificied value
     * @param offset value to be set
     * @param <TValue> value type
     * @return PagingTrait
     */
    <TValue> PagingTrait<T> withOffset(final TValue offset);
    
    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return PagingTrait
     */
    <TValue> PagingTrait<T> addOffset(final TValue offset);
    
    /**
     * set withTotal with the specificied value
     * @param withTotal value to be set
     * @param <TValue> value type
     * @return PagingTrait
     */
    <TValue> PagingTrait<T> withWithTotal(final TValue withTotal);
    
    /**
     * add additional withTotal query parameter
     * @param withTotal value to be added
     * @param <TValue> value type
     * @return PagingTrait
     */
    <TValue> PagingTrait<T> addWithTotal(final TValue withTotal);

    
    default PagingTrait<T> asPagingTrait() {
        return this;
    }
    
    @SuppressWarnings("unchecked")
    default T asPagingTraitToBaseType() {
        return (T)this;
    }
    
}
