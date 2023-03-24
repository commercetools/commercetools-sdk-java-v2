
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QueryTrait
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QueryTrait<T extends QueryTrait<T>> {
    List<String> getWhere();

    /**
     * set where with the specificied value
     * @param where value to be set
     * @param <TValue> value type
     * @return QueryTrait
     */
    <TValue> QueryTrait<T> withWhere(final TValue where);

    /**
     * add additional where query parameter
     * @param where value to be added
     * @param <TValue> value type
     * @return QueryTrait
     */
    <TValue> QueryTrait<T> addWhere(final TValue where);

    /**
     * set predicateVar with the specificied value
     * @param varName placeholder name
     * @param predicateVar value to be set
     * @param <TValue> value type
     * @return QueryTrait
     */
    <TValue> QueryTrait<T> withPredicateVar(final String varName, final TValue predicateVar);

    /**
     * add additional predicateVar query parameter
     * @param varName placeholder name
     * @param predicateVar value to be added
     * @param <TValue> value type
     * @return QueryTrait
     */
    <TValue> QueryTrait<T> addPredicateVar(final String varName, final TValue predicateVar);

    default QueryTrait<T> asQueryTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asQueryTraitToBaseType() {
        return (T) this;
    }

}
