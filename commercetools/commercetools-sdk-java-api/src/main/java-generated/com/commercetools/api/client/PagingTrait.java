
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface PagingTrait<T extends PagingTrait<T>> {
    List<String> getLimit();

    List<String> getOffset();

    List<String> getWithTotal();

    /**
     * set limit with the specificied value
     */
    <TValue> PagingTrait<T> withLimit(final TValue limit);

    /**
     * add additional limit query parameter
     */
    <TValue> PagingTrait<T> addLimit(final TValue limit);

    /**
     * set offset with the specificied value
     */
    <TValue> PagingTrait<T> withOffset(final TValue offset);

    /**
     * add additional offset query parameter
     */
    <TValue> PagingTrait<T> addOffset(final TValue offset);

    /**
     * set withTotal with the specificied value
     */
    <TValue> PagingTrait<T> withWithTotal(final TValue withTotal);

    /**
     * add additional withTotal query parameter
     */
    <TValue> PagingTrait<T> addWithTotal(final TValue withTotal);

    default PagingTrait<T> asPagingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asPagingTraitToBaseType() {
        return (T) this;
    }
}
