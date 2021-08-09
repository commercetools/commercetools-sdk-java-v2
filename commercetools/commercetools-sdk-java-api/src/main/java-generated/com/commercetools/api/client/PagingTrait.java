
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
    PagingTrait<T> withLimit(final int limit);

    /**
     * add additional limit query parameter
     */
    PagingTrait<T> addLimit(final int limit);

    /**
     * set offset with the specificied value
     */
    PagingTrait<T> withOffset(final int offset);

    /**
     * add additional offset query parameter
     */
    PagingTrait<T> addOffset(final int offset);

    /**
     * set withTotal with the specificied value
     */
    PagingTrait<T> withWithTotal(final boolean withTotal);

    /**
     * add additional withTotal query parameter
     */
    PagingTrait<T> addWithTotal(final boolean withTotal);

    default PagingTrait<T> asPagingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asPagingTraitToBaseType() {
        return (T) this;
    }
}
