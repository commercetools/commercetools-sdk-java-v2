
package com.commercetools.api.client;

import java.util.function.Function;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public interface ExpandableRequest<T extends ExpandableRequest<T, TExpand>, TExpand extends ExpansionDsl> {
    <TValue> ExpandableRequest<T, TExpand> withExpand(final TValue where);

    @SuppressWarnings("unchecked")
    default T plusExpand(Function<TExpand, ExpansionDsl> fn) {
        return (T) withExpand(fn.apply(expandDsl()).build());
    }

    TExpand expandDsl();
}
