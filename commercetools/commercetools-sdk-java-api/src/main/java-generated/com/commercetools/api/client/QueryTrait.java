
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface QueryTrait<T extends QueryTrait<T>> {
    List<String> getWhere();

    /**
     * set where with the specificied value
     */
    QueryTrait<T> withWhere(final String where);

    /**
     * add additional where query parameter
     */
    QueryTrait<T> addWhere(final String where);

    /**
     * set predicateVar with the specificied value
     */
    QueryTrait<T> withPredicateVar(final String varName, final String predicateVar);

    /**
     * add additional predicateVar query parameter
     */
    QueryTrait<T> addPredicateVar(final String varName, final String predicateVar);

    default QueryTrait<T> asQueryTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asQueryTraitToBaseType() {
        return (T) this;
    }
}
