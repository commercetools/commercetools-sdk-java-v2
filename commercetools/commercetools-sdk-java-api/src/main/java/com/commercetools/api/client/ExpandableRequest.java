
package com.commercetools.api.client;

import java.util.function.Function;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public interface ExpandableRequest<T extends ExpandableRequest<T, TExpand>, TExpand extends ExpansionDsl> {
    <TValue> T withExpand(final TValue where);

    default T plusExpand(Function<TExpand, ExpansionDsl> fn) {
        return withExpand(fn.apply(expandDsl()).build());
    }

    TExpand expandDsl();
}
